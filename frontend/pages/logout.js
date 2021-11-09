import Head from "next/head";
import Header from "../components/common/Header";
import Footer from "../components/common/Footer";
import styles from "../styles/Home.module.css";
import {Col, Container, Row} from "react-bootstrap";
import React from "react";
import Button from "../components/common/Button";

export default function Logout(props) {
    return (
        <>
            <Head>
                <title>mCarrier</title>
                <link rel="icon" href="/img/faviconlsc.ico" />
            </Head>
            <Header
                optionMenu={props.optionMenuState.value}
                buttonMenu={props.buttonMenuState.value}
                openOptionMenu={props.openOptionMenu}
                closeOptionMenu={props.closeOptionMenu}
                openButtonMenu={props.openButtonMenu}
                closeButtonMenu={props.closeButtonMenu}
                appState={props.appState}
                logout={props.logout}
                navHome={props.navHome}
                navTos={props.navTos}
                navPrivacy={props.navPrivacy}
                navTax={props.navTax}
                navRecords={props.navRecords}
                login={props.login}
                openRegisterModal={props.openRegisterModal}
                inLogoutPage={true}
            />
            <div className={styles.main}>
                <div className={styles.division}>
                    <Container>
                        <Row>
                            <Col>
                                <h1 style={{textAlign:'center'}}>You have been logged out of mCarrier</h1>
                            </Col>
                        </Row>
                        <Row>
                            <Col>
                                <h2 style={{textAlign:'center'}}>Click here to go to the home page</h2>
                            </Col>
                        </Row>
                        <Row className={`justify-content-md-center`}>
                            <Col md={3}>
                                <Button text={"MCARRIER HOME"} color={"blue"} handleClick={props.navHome}/>
                            </Col>
                        </Row>
                    </Container>
                </div>
            </div>
            <Footer/>
        </>
    )
}