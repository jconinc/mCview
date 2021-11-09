import styles from "./CarrierDetail.module.css";
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
import {formatDate, naIfEmpty, translate} from "../../utilities/util";

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

export default function CarrierDetail(props) {

    const user = useSelector((state) => state.central.user);
    const meta = useSelector((state) => state.central.meta);
    const [topLeftQuadrantValue, setTopLeftQuadrantValue] = React.useState(0);
    const [bottomLeftQuadrantValue, setBottomLeftQuadrantValue] = React.useState(0);
    const handleTopLeftTabChange = (event, newValue) => {
        setTopLeftQuadrantValue(newValue);
    };
    const handleBottomLeftTabChange = (event, newValue) => {
        setBottomLeftQuadrantValue(newValue);
    };

    const carrierDetail = useSelector((state) => state.search.carrierDetail);
    const colorCode = Object.keys(carrierDetail.safetyCarrierCompliance).length > 0? 'red' : 'green';
    const safetyCarrierComplianceMessage = Utils.getCarrierComplianceMessage(carrierDetail.safetyCarrierCompliance);
    const config = useSelector((state) => state.central.config);
    let alertsColumns = [
        { selector: row => Utils.naIfEmpty(row.carrierIdNumber), name: "USDOT", sortable: false , width: '12%'},
        {selector: row => Utils.naIfEmpty(Utils.formatDate(row.mcsipLevelDate)), name: "MCSIP Date", sortable: false, width: '15%'},
        { selector: row => Utils.naIfEmpty(Utils.translate(config.mcsip, row.mcsipLevel)), name: "MCSIP Level", sortable: false, width: '50%' },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.lastUpdateDate)), name: "Last Updated", sortable: false, width: '20%' },
    ];

    let registrantColumns = [
        { selector: row => Utils.naIfEmpty(row.registration.irpBaseState) + " - " + Utils.naIfEmpty(row.registration.licensePlateNumber), name: "Jurisdiction", sortable: false, style: {cursor: 'pointer'}   },
        {selector: row => Utils.naIfEmpty(row.registration.irpAccountNumber) + "/" + Utils.naIfEmpty(row.registration.unitNumber), name: "Account/Fleet Number", sortable: false },
        { selector: row => Utils.naIfEmpty(Utils.translate(config.irpStatusCode ,row.registration.irpStatusCode)), name: "Status", sortable: false  },
        { selector: row =>  Utils.naIfEmpty(Utils.formatDate(row.registration.irpStatusDate)), name: "Status Date", sortable: false  },
        { selector: row =>  Utils.naIfEmpty(Utils.formatDate(row.registration.gvwExpireDate)), name: "Expire Date", sortable: false  },
    ];
    let safetyColumns = [
        { selector: row => Utils.naIfEmpty(row.registration.irpBaseState) + " - " + Utils.naIfEmpty(row.registration.licensePlateNumber), name: "Jurisdiction", sortable: false , style: {cursor: 'pointer'} },
        {selector: row => Utils.naIfEmpty(row.registration.irpAccountNumber) + "/" + Utils.naIfEmpty(row.registration.unitNumber), name: "Account/Fleet Number", sortable: false },
        { selector: row => Utils.naIfEmpty(Utils.translate(config.irpStatusCode ,row.registration.irpStatusCode)), name: "Status", sortable: false  },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.registration.irpStatusDate)), name: "Status Date", sortable: false  },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.registration.gvwExpireDate)), name: "Expire Date", sortable: false  },
    ];

    let iftaColumns = [
        { selector: row => Utils.naIfEmpty(row.iftaBaseState), name: "Base Juris", sortable: false  },
        {selector: row => Utils.naIfEmpty(Utils.formatDate(row.iftaExpireDate)), name: "Expire Date", sortable: false },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.iftaIssueDate)), name: "Issue Date", sortable: false  },
        { selector: row => Utils.naIfEmpty(row.iftaLicenseNumber), name: "License Number", sortable: false  },
        { selector: row => Utils.naIfEmpty(Utils.translate(config.iftaStatusCode, row.iftaStatusCode)), name: "Status", sortable: false  },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.iftaStatusDate)), name: "Status Date", sortable: false  },
    ];
    let ucrColumns = [
        { selector: row => Utils.naIfEmpty(Utils.formatUcrState(config.juris, row.baseState)), name: "Base Juris", sortable: false  },
        {selector: row => Utils.naIfEmpty(row.feePaymentFlag ), name: "Payment Flag", sortable: false },
        { selector: row => Utils.naIfEmpty(row.intrastateFlag), name: "Intra State Flag", sortable: false  },
        { selector: row => Utils.naIfEmpty(row.registrationYear), name: "Registration Year", sortable: false  },
        { selector: row => Utils.naIfEmpty(Utils.formatDate(row.paymentUpdateDate)), name: "Payment Update Date", sortable: false  },
    ];

    return (
        <div className={styles.outer} id={'carrierDetail'}>

                <Row style={{height: '50%'}}>
                    <div className={styles.quadrant}>

                            <Col md={12} style={{overflow: 'auto'}}>
                                <TitleBar verbiage={carrierDetail.carrier.carrierName   + " | USDOT:  " + carrierDetail.carrier.carrierIdNumber } color={colorCode}/>
                                <h5>Entity</h5>
                                <Table striped>
                                    <tbody>
                                        <tr>
                                            <td className={styles.label}>Legal Name</td>
                                            <td>{Utils.naIfEmpty(carrierDetail.carrier.carrierName)}</td>
                                        </tr>
                                        <tr>
                                            <td className={styles.label}>DBA Name</td>
                                            <td>{Utils.naIfEmpty(carrierDetail.carrier.dbaName)}</td>
                                        </tr>
                                        <tr>
                                            <td className={styles.label}>Address</td>
                                            <td>{carrierDetail.carrier.street}, {carrierDetail.carrier.city} {carrierDetail.carrier.state} {carrierDetail.carrier.zipCode}</td>
                                        </tr>
                                        <tr>
                                            <td className={styles.label}>Telephone</td>
                                            <td>{Utils.naIfEmpty(carrierDetail.carrier.telephoneNumber)}</td>
                                        </tr>
                                        <tr>
                                            <td className={styles.label}>Email</td>
                                            <td>{Utils.naIfEmpty(carrierDetail.carrier.emailAddress)}</td>
                                        </tr>
                                    </tbody>
                                </Table>
                            </Col>

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
                                        <td>{carrierDetail.carrier.carrierIdNumber}, {carrierDetail.carrier.carrierName}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Entity Type</td>
                                        <td>{Utils.translate(config.entityTypes, carrierDetail.carrier.entityType)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Operation Type</td>
                                        <td>{Utils.getOperationType(carrierDetail.carrier)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>FMCSA Legal Name</td>
                                        <td>{Utils.naIfEmpty(carrierDetail.carrier.carrierName)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>FMCSA DBA Name</td>
                                        <td>{Utils.naIfEmpty(carrierDetail.carrier.dbaName)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>FMCSA USDOT Status</td>
                                        <td>{Utils.translate(config.carrierStatus, carrierDetail.carrier.mcmisStatus)}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>MCSIP Step</td>
                                        <td>{Utils.translate(config.mcsip, carrierDetail.carrier.mcsipLevel, 'NOT IN MCSIP')}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Address</td>
                                        <td>{carrierDetail.carrier.street}, {carrierDetail.carrier.city} {carrierDetail.carrier.state} {carrierDetail.carrier.zipCode}</td>
                                    </tr>
                                    <tr>
                                        <td className={styles.label}>Telephone</td>
                                        <td>{Utils.naIfEmpty(carrierDetail.carrier.telephoneNumber)}</td>
                                    </tr>
                                    </tbody>
                                </Table>
                            </TabPanel>
                            <TabPanel value={topLeftQuadrantValue} index={1} className={styles.tabPanel}>
                                <DataTable title={""}  data={carrierDetail.alerts} columns={alertsColumns} customStyles={customStyles} pagination/>
                            </TabPanel>

                        </div>
                    </div>
                </Row>
                <Row>

                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={' '} color={colorCode}/>
                        </div>
                    </div>
                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={'Fleet Management (As Per SAFER)'} color={colorCode}/>
                            <Paper square>
                                <Tabs
                                    value={bottomLeftQuadrantValue}
                                    indicatorColor="primary"
                                    textColor="primary"
                                    onChange={handleBottomLeftTabChange}
                                    aria-label=""
                                >
                                    <Tab label="REGISTRANT"  {...a11yProps(0)}/>
                                    <Tab label="SAFETY"  {...a11yProps(1)}/>
                                    <Tab label="IFTA"  {...a11yProps(2)}/>
                                    <Tab label="UCR"  {...a11yProps(3)}/>
                                </Tabs>
                            </Paper>
                            <TabPanel value={bottomLeftQuadrantValue} index={0} className={styles.tabPanel} >
                                <DataTable title={""}  data={carrierDetail.registrant} columns={registrantColumns}  onRowClicked={(data) => props.viewVehicleDetail(data)} customStyles={customStyles} pagination/>
                            </TabPanel>
                            <TabPanel value={bottomLeftQuadrantValue} index={1} className={styles.tabPanel}>
                                <DataTable title={""}  data={carrierDetail.safety} columns={safetyColumns} customStyles={customStyles} onRowClicked={(data) => props.viewVehicleDetail(data)} pagination/>
                            </TabPanel>
                            <TabPanel value={bottomLeftQuadrantValue} index={2} className={styles.tabPanel}>
                                <DataTable title={""}  data={carrierDetail.ifta} columns={iftaColumns} customStyles={customStyles} pagination/>
                            </TabPanel>
                            <TabPanel value={bottomLeftQuadrantValue} index={3} className={styles.tabPanel}>
                                <DataTable title={""}  data={carrierDetail.ucr} columns={ucrColumns} customStyles={customStyles} pagination/>
                            </TabPanel>


                        </div>
                    </div>

            </Row>
        </div>
    )
}