import {Col, Container, Row} from "react-bootstrap";
import formStyles from "../../styles/Content.module.css";
import React from "react";
import Button from "../Button";

export default function Security(props) {

    const apf = props.data.accountProfileForm;

    const handleAction = (target) => {
        props.update(target);
    }

    return (
        <>
            <Container style={{maxWidth:'100%'}}>
                <Row className={formStyles.sectionRow}>
                    <Col md={12} className={formStyles.sectionSolo}>
                        <div className={formStyles.formSection} style={{height:'calc(100% - 8px)'}}>
                            <Container style={{maxWidth:'100%'}}>
                                <Row>
                                    <Col>
                                        <h4 className={`green`}>
                                            {props.title}
                                        </h4>
                                    </Col>
                                </Row>
                            </Container>
                        </div>
                    </Col>
                </Row>
            </Container>
            <Container>
                <Row>
                    <Col md={8}></Col>
                    <Col md={4}>
                        <Button color={'green'} text={'SAVE'} handleClick={props.submit} />
                    </Col>
                </Row>
            </Container>
        </>
    )
}