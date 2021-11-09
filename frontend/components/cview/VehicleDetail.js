import styles from "./VehicleDetail.module.css";
import React from "react";
import TitleBar from "../common/TitleBar";
import {useSelector} from "react-redux";
import {Col, Container, Row, Table} from "react-bootstrap";
import DataTable from 'react-data-table-component';
import TabPanel  from '../common/TabPanel';
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import Paper from '@material-ui/core/Paper';

import * as Utils from "../../utilities/util";
import {formatDate, getJurisName, naIfEmpty, translate} from "../../utilities/util";

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
            fontWeight: 'bold',
            paddingLeft: '5px', // override the cell padding for data cells
            paddingRight: '5px',
            paddingTop: '5px',
            paddingBottom: '5px',
            whiteSpace: 'wrap',
        },
    },
    headRow: {
        style: {
            minHeight: '31px', // override the row height
        },
    },
    rows: {
        style: {
            minHeight: '31px', // override the row height
        },
    },
    cells: {
        style: {
            paddingLeft: '5px', // override the cell padding for data cells
            paddingRight: '5px',
            paddingTop: '5px',
            paddingBottom: '5px',
        },
    },
}

export default function VehicleDetail(props) {

    const user = useSelector((state) => state.central.user);
    const meta = useSelector((state) => state.central.meta);
    const [topLeftQuadrantValue, setTopLeftQuadrantValue] = React.useState(0);
    const [topRightQuadrantValue, setTopRightQuadrantValue] = React.useState(0);
    const [bottomRightQuadrantValue, setBottomRightQuadrantValue] = React.useState(0);
    const handleTopLeftTabChange = (event, newValue) => {
        setTopLeftQuadrantValue(newValue);
    };
    const handleTopRightTabChange = (event, newValue) => {
        setTopRightQuadrantValue(newValue);
    };
    const handleBottomRightTabChange = (event, newValue) => {
        setBottomRightQuadrantValue(newValue);
    };

    const vehicleDetail = useSelector((state) => state.search.vehicleDetail);
    console.log(vehicleDetail);
    const config = useSelector((state) => state.central.config);
    let alertsColumns = [
        { selector: row => Utils.naIfEmpty(row.safetyCarrier), name: "USDOT", sortable: false , width: '12%'},
        {selector: row => Utils.naIfEmpty(row.licensePlateNumber + "/" + row.registrationJurisdiction), name: "License/Jur", sortable: false, width: '23%'},
        { selector: row => Utils.naIfEmpty(Utils.translate(config.mcsip, row.mcsipStep)), name: "MCSIP Level", sortable: false, width: '45%' },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.lastUpdateDate)), name: "Last Updated", sortable: false, width: '20%' },
    ];

    let carrierAlertsColumns = [
        { selector: row => Utils.naIfEmpty(row.carrierIdNumber), name: "USDOT", sortable: false , width: '12%'},
        {selector: row => Utils.naIfEmpty(Utils.formatDate(row.mcsipLevelDate)), name: "MCSIP Date", sortable: false, width: '15%'},
        { selector: row => Utils.naIfEmpty(Utils.translate(config.mcsip, row.mcsipLevel)), name: "MCSIP Level", sortable: false, width: '50%' },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.lastUpdateDate)), name: "Last Updated", sortable: false, width: '20%' },
    ];
    let vehicleAlertsColumns = [
        { selector: row => Utils.naIfEmpty(row.safetyCarrier), name: "USDOT", sortable: false , width: '12%'},
        {selector: row => Utils.naIfEmpty(row.mcsipLevelDate), name: "MCSIP Date", sortable: false, width: '15%'},
        { selector: row => Utils.naIfEmpty(Utils.translate(config.mcsip, row.mcsipLevel)), name: "MCSIP Level", sortable: false, width: '35%' },
        { selector: row => Utils.naIfEmpty(row.lastUpdateDate), name: "Last Updated", sortable: false, width: '20%' },
    ];

    const colorCode = vehicleDetail && ((vehicleDetail.safetyCarrierCompliance && Object.keys(vehicleDetail.safetyCarrierCompliance).length > 0) ||
        (vehicleDetail.vehicleCompliance && Object.keys(vehicleDetail.vehicleCompliance).length > 0))? 'red' : 'green';
    const safetyCarrierComplianceMessage = Utils.getCarrierComplianceMessage(vehicleDetail.safetyCarrierCompliance);
    const vehicleComplianceMessage = Utils.getVehicleComplianceMessage(vehicleDetail.vehicleCompliance);

    return (
        <div className={styles.outer} id={'VehicleDetail'}>

                <Row style={{height: '50%'}}>
                    <div className={styles.quadrant}>

                        <div>
                            <TitleBar verbiage={'Registrant'} color={colorCode}/>
                            <Paper square>
                                <Tabs
                                    value={topRightQuadrantValue}
                                    indicatorColor="primary"
                                    textColor="primary"
                                    onChange={handleTopRightTabChange}
                                    aria-label=""
                                >
                                    <Tab label="REGISTRANT"  {...a11yProps(0)}/>
                                    <Tab label="ALERT/STOPS"  {...a11yProps(0)}/>
                                </Tabs>
                            </Paper>
                            <TabPanel value={topRightQuadrantValue} index={0} className={styles.tabPanel} >
                                <Table striped>
                                    <tbody>
                                    <tr>
                                        <td className={styles.label}>USDOT</td>
                                        <td>{vehicleDetail.registrant.carrierIdNumber}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Legal Name</td>
                                        <td>{vehicleDetail.registrant.carrierName}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>DBA Name</td>
                                        <td>{vehicleDetail.registrant.dbaName}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Address Name</td>
                                        <td>{vehicleDetail.registrant.street}, {vehicleDetail.registrant.city} {vehicleDetail.registrant.state} {vehicleDetail.registrant.zipCode}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Telephone</td>
                                        <td>{Utils.naIfEmpty(vehicleDetail.registrant.telephoneNumber)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Email</td>
                                        <td>{Utils.naIfEmpty(vehicleDetail.registrant.emailAddress)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Status</td>
                                        <td>{Utils.translate(config.carrierStatus, vehicleDetail.registrant.mcmisStatus)}</td>
                                    </tr>


                                    </tbody>
                                </Table>
                            </TabPanel>
                            <TabPanel value={topRightQuadrantValue} index={1} className={styles.tabPanel}>
                                <DataTable title={""} noDataComponent={'THERE ARE NO ALERTS TO DISPLAY'} data={vehicleDetail.registrantAlerts} columns={alertsColumns} customStyles={customStyles} pagination/>
                            </TabPanel>

                        </div>

                    </div>
                   <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={'Safety Carrier Eligibility: ' + safetyCarrierComplianceMessage} color={colorCode}/>
                            <Paper square>
                                <Tabs
                                    value={topLeftQuadrantValue}
                                    indicatorColor="primary"
                                    textColor="primary"
                                    onChange={handleTopLeftTabChange}
                                    aria-label=""
                                >
                                    <Tab label="SAFETY CARRIER"  {...a11yProps(0)}/>
                                    <Tab label="FMCSA ALERT/STOPS"  {...a11yProps(0)}/>
                                </Tabs>
                            </Paper>
                            <TabPanel value={topLeftQuadrantValue} index={0} className={styles.tabPanel} >
                                <Table striped>
                                    <tbody>
                                    <tr>
                                        <td className={styles.label}>Safety USDOT (number, name)</td>
                                        <td>{vehicleDetail.safetyCarrier.carrierIdNumber}, {vehicleDetail.safetyCarrier.carrierName}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Entity Type</td>
                                        <td>{Utils.translate(config.entityTypes, vehicleDetail.safetyCarrier.entityType)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Operation Type</td>
                                        <td>{Utils.getOperationType(vehicleDetail.safetyCarrier)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>FMCSA Legal Name</td>
                                        <td>{Utils.naIfEmpty(vehicleDetail.safetyCarrier.carrierName)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>FMCSA DBA Name</td>
                                        <td>{Utils.naIfEmpty(vehicleDetail.safetyCarrier.dbaName)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>FMCSA USDOT Status</td>
                                        <td>{Utils.translate(config.carrierStatus, vehicleDetail.safetyCarrier.mcmisStatus)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>MCSIP Step</td>
                                        <td>{Utils.translate(config.mcsip, vehicleDetail.safetyCarrier.mcsipLevel)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Address</td>
                                        <td>{vehicleDetail.safetyCarrier.street}, {vehicleDetail.safetyCarrier.city} {vehicleDetail.safetyCarrier.state} {vehicleDetail.safetyCarrier.zipCode}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Telephone</td>
                                        <td>{Utils.naIfEmpty(vehicleDetail.safetyCarrier.telephoneNumber)}</td>
                                    </tr>
                                    </tbody>
                                </Table>
                            </TabPanel>
                            <TabPanel value={topLeftQuadrantValue} index={1} className={styles.tabPanel}>
                                <DataTable title={""} noDataComponent={'THERE ARE NO ALERTS TO DISPLAY'}  data={vehicleDetail.safetyCarrierAlerts} columns={carrierAlertsColumns} customStyles={customStyles} pagination/>
                            </TabPanel>

                        </div>
                    </div>
                </Row>
                <Row>

                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={'Registration Details: ' + vehicleComplianceMessage} color={colorCode}/>
                            <Paper square>
                                <Tabs
                                    value={bottomRightQuadrantValue}
                                    indicatorColor="primary"
                                    textColor="primary"
                                    onChange={handleBottomRightTabChange}
                                    aria-label=""
                                >
                                    <Tab label="REGISTRATION DETAILS"  {...a11yProps(0)}/>
                                    <Tab label="ALERT/STOPS"  {...a11yProps(0)}/>
                                </Tabs>
                            </Paper>
                            <TabPanel value={bottomRightQuadrantValue} index={0} className={styles.tabPanel} >
                                <Table striped>
                                    <tbody>
                                    <tr>
                                        <td className={styles.label}>Plate/Jurisdiction</td>
                                        <td>{vehicleDetail.vehicle.registration.licensePlateNumber}/{vehicleDetail.vehicle.registration.irpBaseState}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>VIN</td>
                                        <td>{vehicleDetail.vehicle.vin.vin}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Make</td>
                                        <td>{vehicleDetail.vehicle.vin.make}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Model Year</td>
                                        <td>{vehicleDetail.vehicle.vin.modelYear}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Vehicle Type</td>
                                        <td>{Utils.translate(config.vehicleType, vehicleDetail.vehicle.vin.type, vehicleDetail.vehicle.vin.type)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Registration Expire Date</td>
                                        <td>{Utils.formatDate(vehicleDetail.vehicle.registration.registrationExpireDate)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Fuel</td>
                                        <td>{Utils.translate(config.fuel, vehicleDetail.vehicle.vin.fuel, vehicleDetail.vehicle.vin.fuel)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Unladen</td>
                                        <td>{vehicleDetail.vehicle.vin.unladenWeight}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Licensed GVW <br />({Utils.getJurisName(config.juris, vehicleDetail.vehicle.registration.irpBaseState)})</td>
                                        <td>{vehicleDetail.vehicle.registration.gvw}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Axles or seats</td>
                                        <td>{vehicleDetail.vehicle.vin.numberOfAxles}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Status</td>
                                        <td>{Utils.translate(config.irpStatusCode ,vehicleDetail.vehicle.registration.irpStatusCode)}</td>
                                    </tr>
                                    </tbody>
                                </Table>
                            </TabPanel>
                            <TabPanel value={bottomRightQuadrantValue} index={1} className={styles.tabPanel}>
                                <DataTable title={""} noDataComponent={'THERE ARE NO ALERTS TO DISPLAY'}  data={vehicleDetail.vehicleAlerts} columns={alertsColumns} customStyles={customStyles} pagination/>
                            </TabPanel>
                        </div>
                    </div>
                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={''} color={colorCode}/>



                        </div>
                    </div>

            </Row>
        </div>
    )
}