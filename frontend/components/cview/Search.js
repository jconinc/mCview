import styles from "./Search.module.css";
import React, {useState } from "react";
import DataTable from 'react-data-table-component';
import TitleBar from "../common/TitleBar";
import Loading from "../common/Loading";
import TabPanel  from '../common/TabPanel';
import {useSelector} from "react-redux";
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import Paper from '@material-ui/core/Paper';
import TextField from '@material-ui/core/TextField';
import {Col, Container, Row} from "react-bootstrap";
import formStyles from "../../styles/Content.module.css";
import { ValidatorForm, TextValidator, SelectValidator} from 'react-material-ui-form-validator';
import Radio from '@material-ui/core/Radio';
import RadioGroup from '@material-ui/core/RadioGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import FormControl from '@material-ui/core/FormControl';
import * as StringUtils from '../../utilities/util';
import TextBox from '../common/TextBox';
import SelectField from '../common/SelectField';
import FormLabel from '@material-ui/core/FormLabel';
import Button from "../common/Button";
import RadioButton from "../common/RadioButton";

import { styled } from '@material-ui/core/styles';
import {
    useTheme,
    createTheme,
    MuiThemeProvider
} from "@material-ui/core/styles";
import {submitUSDOTSearch} from "../../redux/actions/search/action";

function a11yProps(index) {
    return {
        id: `simple-tab-${index}`,
        'aria-controls': `simple-tabpanel-${index}`,
    };
}

const customStyles = {
    headCells: {
        style: {
            backgroundColor: '#d3d3d3',
            fontSize: '15px',
            fontWeight: 'bold'
        },
    },
}



export default function Search(props)  {

    const [value, setValue] = React.useState(0);
    const [currentSearch, setSearchValue] = React.useState('');
    const usdotSearchResults = useSelector((state) => state.search.usdotResults);
    const vehicleSearchResults = useSelector((state) => state.search.vehicleResults);

    const usdotLoading = useSelector((state) => state.search.usdotLoading);
    const vehicleLoading = useSelector((state) => state.search.vehicleLoading);

    console.log("Vehicle Loading:", vehicleLoading);
    const handleTabChange = (event, newValue) => {
        setValue(newValue);
    };
    if(currentSearch == 'USDOT' && usdotSearchResults && usdotSearchResults.results && usdotSearchResults.results.length == 1){
        props.viewCarrierDetail(usdotSearchResults.results[0]);
        setSearchValue('');
    }else if(currentSearch == 'VEHICLE' && vehicleSearchResults && vehicleSearchResults.results && vehicleSearchResults.results.length == 1){
        props.viewVehicleDetail(vehicleSearchResults.results[0]);
        setSearchValue('');
    }
    const [formValue, setFormValue] = useState({
        vehicleJurisdiction: " ",
        vehicleCriteria: "",
        vehicleType: "plate",
        usdotType: "usdot",
        usdotJurisdiction: " ",
        usdotCriteria: "",
    });

    const handleChange = (event) => {
        const {name, value } = event.target;
        setFormValue((prevState) => {
            return {
                ...prevState,
                [name]: value,
            };
        });
        if(name == 'usdotCriteria' && value && value.length > 3){
            props.submitUSDOTSearch({pageSize: usdotSearchResults.pageSize, page: usdotSearchResults.page, usdotJurisdiction: usdotJurisdiction, usdotCriteria: value, usdotType: usdotType, searchType: 'USDOT'});
        }else if(name == 'vehicleCriteria' && value && value.length > 3){
            props.submitVehicleSearch({pageSize: vehicleSearchResults.pageSize, page: vehicleSearchResults.page, vehicleJurisdiction: vehicleJurisdiction, vehicleCriteria: value, vehicleType: vehicleType, searchType: 'VEHICLE'});
        }

    }

    const  changeVehiclePage = (page, totalRows) => {
        props.submitVehicleSearch({pageSize: vehicleSearchResults.pageSize, page: page, vehicleJurisdiction: vehicleJurisdiction, vehicleCriteria: vehicleCriteria, vehicleType: vehicleType, searchType: 'vehicle'});
    }

    const  changeVehicleRowsPerPage = (currentRowsPerPage, currentPage) =>{
        props.submitVehicleSearch({pageSize: currentRowsPerPage, page: currentPage, vehicleJurisdiction: vehicleJurisdiction, vehicleCriteria: vehicleCriteria, vehicleType: vehicleType, searchType: 'vehicle'});
    }

    const  changePage = (page, totalRows) => {
        props.submitUSDOTSearch({pageSize: usdotSearchResults.pageSize, page: page, usdotJurisdiction: usdotJurisdiction, usdotCriteria: usdotCriteria, usdotType: usdotType, searchType: 'usdot'});
    }

    const  changeRowsPerPage = (currentRowsPerPage, currentPage) =>{
        props.submitUSDOTSearch({pageSize: currentRowsPerPage, page: currentPage, usdotJurisdiction: usdotJurisdiction, usdotCriteria: usdotCriteria, usdotType: usdotType, searchType: 'usdot'});
    }


    const handleSubmit = (event, submissionType) => {
        setSearchValue(submissionType);
        if(submissionType == 'USDOT'){
            props.submitUSDOTSearch({pageSize: usdotSearchResults.pageSize, page: usdotSearchResults.page, usdotJurisdiction: usdotJurisdiction, usdotCriteria: usdotCriteria, usdotType: usdotType, searchType: submissionType});
        }else if(submissionType == 'VEHICLE'){
            props.submitVehicleSearch({pageSize: vehicleSearchResults.pageSize, page: vehicleSearchResults.page, vehicleJurisdiction: vehicleJurisdiction, vehicleCriteria: vehicleCriteria, vehicleType: vehicleType, searchType: submissionType});
        }
    }
    const { vehicleJurisdiction, vehicleCriteria, usdotJurisdiction,  usdotCriteria, usdotType, vehicleType} = formValue;

    const config = useSelector((state) => state.central.config);
    const jurisdictionList = StringUtils.getListOptions(config.juris, 'SELECT JURISDICTION');

    ValidatorForm.addValidationRule('jurisUSDOT', (value) => {
        if(usdotType == "plate" && (!value || value.trim().length == 0 )){
            return false
        }else {
            return true;
        }
    });

    ValidatorForm.addValidationRule('jurisVehicle', (value) => {
        if(vehicleType == "plate" && (!value || value.trim().length == 0 )){
            return false
        }else {
            return true;
        }
    });



    let carrierColumns = [];
    if(usdotSearchResults.usdotType == "vin") {
        carrierColumns = [
            {selector: row => row.carrier.carrierIdNumber, name: "USDOT", sortable: false, width: '10%'},
            {selector: row => row.carrier.carrierName, name: "Carrier Legal Name", sortable: false, width: '25%'},
            {selector: row => row.vin.vin, name: "VIN", sortable: false, width: '20%'},
            {selector: row => row.carrier.street, name: "Address", sortable: false, width: '10%'},
            {selector: row => row.carrier.city, name: "City", sortable: false, width: '15%'},
            {selector: row => row.carrier.state, name: "State", sortable: false, width: '10%'},
            {selector: row => row.carrier.zipCode, name: "ZIP Code", sortable: false, width: '10%'},
        ];
    } else  if(usdotSearchResults.usdotType == "plate"){
        carrierColumns = [
            { selector: row => row.carrier.carrierIdNumber, name: "USDOT" , sortable: false, width: '10%'},
            { selector: row => row.carrier.carrierName, name: "Carrier Legal Name", sortable: false, width: '25%' },
            { selector: row => row.registration.licensePlateNumber + "/" + row.registration.irpBaseState, name: "Plate/State", sortable: false , width: '20%'},
            { selector: row => row.carrier.street, name: "Address", sortable: false, width: '10%' },
            { selector: row => row.carrier.city, name: "City", sortable: false , width: '15%'},
            { selector: row => row.carrier.state, name: "State", sortable: false, width: '10%' },
            { selector: row => row.carrier.zipCode, name: "ZIP Code", sortable: false, width: '10%' },
        ];

    }else  {
        carrierColumns = [
            { selector: row => row.carrierIdNumber, name: "USDOT" , sortable: false, width: '10%'},
            { selector: row => row.carrierName, name: "Carrier Legal Name", sortable: false, width: '25%' },
            { selector: row => row.dbaName, name: "DBA Name", sortable: false , width: '20%'},
            { selector: row => row.street, name: "Address", sortable: false, width: '10%' },
            { selector: row => row.city, name: "City", sortable: false , width: '15%'},
            { selector: row => row.state, name: "State", sortable: false, width: '10%' },
            { selector: row => row.zipCode, name: "ZIP Code", sortable: false, width: '10%' },
        ];

    }

    let vehicleColumns = [
        { selector: row => row.registration.licensePlateNumber + "/" + row.registration.irpBaseState, name: "Plate/State", sortable: false , width: '15%'},
        {selector: row => row.vin.vin, name: "VIN", sortable: false, width: '20%'},
        { selector: row => row.carrier.carrierName, name: "Safety Carrier", sortable: false, width: '25%' },
        { selector: row => row.carrier.dbaName, name: "DBA Carrier", sortable: false, width: '20%' },
        { selector: row => row.carrier.state, name: "State", sortable: false, width: '10%' },

        { selector: row => row.carrier.carrierIdNumber, name: "USDOT" , sortable: false, width: '10%'},
    ];
    return (

        <div className={styles.outer}>

            <Paper square>
                <TitleBar color={'green'} verbiage={'Search'}/>
                <Tabs
                    value={value}
                    indicatorColor="primary"
                    textColor="primary"
                    onChange={handleTabChange}
                    aria-label=""
                >
                    <Tab label="USDOT"  {...a11yProps(0)}/>
                    <Tab label="Vehicle"  {...a11yProps(1)}/>
                </Tabs>
            </Paper>
            <TabPanel value={value} index={0} className={styles.tabPanel}>
                <Row className={formStyles.sectionRow}>
                    <Col md={12} className={formStyles.sectionSolo}>
                        <div className={formStyles.formSection} style={{height: 'calc(100% - 8px)'}}>
                            <Container style={{maxWidth: '100%'}}>
                                <ValidatorForm
                                    onSubmit={(data) => handleSubmit(data, 'USDOT')}>

                                    <Row>
                                        <Col>
                                            <h4 className={styles.textGreen}>Search USDOT</h4>
                                        </Col>
                                    </Row>
                                    <Row className={formStyles.sectionRow}>
                                        <Col md={12}>
                                            <span style={{color: 'red'}}>* </span>
                                            Criteria
                                        </Col>
                                    </Row>
                                    <Row className={formStyles.sectionRow}>
                                        <Col md={6}>
                                            <TextBox id="standard-basic" label="" fullWidth={true}
                                                             variant="outlined" size="small" margin="none" validators={['required']}  errorMessages={['FIELD IS REQUIRED']}
                                                             className="inputRounded" name={"usdotCriteria"} onChange={handleChange} value={usdotCriteria}
                                                             inputProps={{}}
                                            />
                                        </Col>
                                        <Col md={6}>&nbsp;</Col>
                                    </Row>
                                    <Row className={formStyles.sectionRow}>
                                        <Col md={12}>
                                            Jurisdiction
                                        </Col>
                                    </Row>
                                    <Row>
                                        <Col md={6}>
                                            <SelectField variant='outlined' size="small" margin="none"
                                                         onChange={handleChange}
                                                         defaultValue={''}
                                                         value={usdotJurisdiction}
                                                         validators={['jurisUSDOT']}
                                                         errorMessages={['JURISDICTION IS REQUIRED FOR PLATE SEARCHES']}
                                                         inputProps={{
                                                             name: 'usdotJurisdiction',
                                                             id: 'usdotJurisdiction',
                                                         }}
                                            >
                                                {jurisdictionList}
                                            </SelectField>
                                        </Col>
                                        <Col md={6}>&nbsp;</Col>
                                    </Row>
                                    <Row>
                                        <Col md={7} lg={8}>
                                            <FormControl component="fieldset">
                                                <RadioGroup aria-label="usdotType" name="usdotType" value={usdotType}
                                                            onChange={handleChange} row>
                                                    <FormControlLabel value="usdot" control={<Radio required={true}/>}
                                                                      label="USDOT #"/>
                                                    <FormControlLabel value="plate" control={<Radio required={true}/>}
                                                                      label="Plate"/>
                                                    <FormControlLabel value="carrierLegalName" control={<Radio required={true}/>}
                                                                      label="Carrier Legal Name"/>
                                                    <FormControlLabel value="carrierDBAName" control={<Radio required={true}/>}
                                                                      label="Carrier DBA Name"/>
                                                    <FormControlLabel value="vin" control={<Radio required={true}/>} label="VIN"/>
                                                    <FormControlLabel value="tin" control={<Radio required={true}/>} label="TIN"/>
                                                </RadioGroup>
                                            </FormControl>
                                        </Col>

                                        <Col md={2} lg={2}>
                                            {usdotLoading && <Loading />}
                                        </Col>
                                        <Col md={3} lg={2}>
                                            <Button color={'green'} text={'SEARCH'} type={"submit"} />
                                        </Col>
                                    </Row>
                                    <DataTable title={"Results"} onRowClicked={(data) => props.viewCarrierDetail(data)}
                                               paginationTotalRows={usdotSearchResults.count} data={usdotSearchResults.results}
                                               paginationPerPage={usdotSearchResults.pageSize} columns={carrierColumns} paginationServer={true}
                                               onChangePage={(page, totalRows) => changePage(page, totalRows)}
                                               paginationRowsPerPageOptions={[10,30,50,100]} customStyles={customStyles}
                                               onChangeRowsPerPage={(currentRowsPerPage, currentPage) => changeRowsPerPage(currentRowsPerPage, currentPage)} pagination/>
                                </ValidatorForm>
                            </Container>
                        </div>
                    </Col>
                </Row>
            </TabPanel>

            <TabPanel value={value} index={1} className={styles.tabPanel}>
                <Row className={formStyles.sectionRow}>
                    <Col md={12} className={formStyles.sectionSolo}>
                        <div className={formStyles.formSection} style={{height: 'calc(100% - 8px)'}}>
                            <Container style={{maxWidth: '100%'}}>
                                <ValidatorForm
                                    onSubmit={(data) => handleSubmit(data, 'VEHICLE')}>

                                    <Row>
                                        <Col>
                                            <h4 className={styles.textGreen}>Search Vehicle</h4>
                                        </Col>
                                    </Row>

                                    <Row className={formStyles.sectionRow}>
                                        <Col md={12}>
                                            <span style={{color: 'red'}}>* </span>
                                            Criteria
                                        </Col>
                                    </Row>

                                    <Row className={formStyles.sectionRow}>
                                        <Col md={6}>
                                            <TextBox id="standard-basic" label="" fullWidth={true} onChange={handleChange}
                                                             variant="outlined" size="small" margin="none" name={"vehicleCriteria"}/>
                                        </Col>
                                        <Col md={6}>&nbsp;</Col>
                                    </Row>
                                    <Row className={formStyles.sectionRow}>
                                        <Col md={12}>
                                            Jurisdiction
                                        </Col>
                                    </Row>
                                    <Row className={formStyles.sectionRow}>
                                        <Col md={6}>
                                            <SelectField variant='outlined' size="small" margin="none"
                                                         value={vehicleJurisdiction}
                                                         defaultValue={''}
                                                         validators={['jurisVehicle']}
                                                         onChange={handleChange}
                                                         errorMessages={['JURISDICTION IS REQUIRED FOR PLATE SEARCHES']}
                                                         inputProps={{
                                                             name: 'vehicleJurisdiction',
                                                             id: 'vehicleJurisdiction',
                                                         }}
                                            >
                                                {jurisdictionList}
                                            </SelectField>
                                        </Col>
                                        <Col md={6}>&nbsp;</Col>
                                    </Row>

                                    <Row className={formStyles.sectionRow}>
                                        <Col md={7}>
                                            <FormControl component="fieldset">
                                                <RadioGroup aria-label="vehicleType" name="vehicleType" value={vehicleType}
                                                            onChange={handleChange} row>
                                                    <FormControlLabel value="vin" control={<Radio required={true}/>} label="VIN"/>
                                                    <FormControlLabel value="plate" control={<Radio required={true}/>}
                                                                      label="Plate"/>
                                                    <FormControlLabel value="usdot" control={<Radio required={true}/>}
                                                                      label="USDOT #"/>
                                                    <FormControlLabel value="carrierLegal" control={<Radio required={true}/>}
                                                                      label="Carrier Legal Name"/>
                                                    <FormControlLabel value="carrierDBA" control={<Radio required={true}/>}
                                                                      label="Carrier DBA Name"/>
                                                </RadioGroup>
                                            </FormControl>
                                        </Col>
                                        <Col md={2} lg={2}>
                                            {vehicleLoading && <Loading />}
                                        </Col>
                                        <Col md={3}>
                                            <Button color={'green'} text={'SEARCH'} handleClick={props.submit} />
                                        </Col>
                                    </Row>
                                    <DataTable title={"Results"} onRowClicked={(data) => props.viewVehicleDetail(data)}
                                               paginationTotalRows={vehicleSearchResults.count} data={vehicleSearchResults.results}
                                               paginationPerPage={vehicleSearchResults.pageSize} columns={vehicleColumns} paginationServer={true}
                                               onChangePage={(page, totalRows) => changeVehiclePage(page, totalRows)}
                                               paginationRowsPerPageOptions={[10,30,50,100]} customStyles={customStyles}
                                               onChangeRowsPerPage={(currentRowsPerPage, currentPage) => changeVehicleRowsPerPage(currentRowsPerPage, currentPage)} pagination/>
                                </ValidatorForm>
                            </Container>
                        </div>
                    </Col>
                </Row>

            </TabPanel>
        </div>

    );

}
