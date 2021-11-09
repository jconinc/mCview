import {Col, Container, Row} from "react-bootstrap";
import formStyles from "../../styles/Content.module.css";
import React from "react";
import InputMask from "react-input-mask";
import Button from "../Button";

export default function Profile(props) {

    const entries = props.data.entries;
    const errors = props.data.errors;
    const msgs = props.data.msgs;

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
                                <Row>
                                    <Col md={6}>
                                        <div>
                                            <span style={{color:'red'}}>*</span>
                                            Email Address
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'email'}
                                            className={errors.email ? `standard error` : `standard`}
                                            value={entries.email}
                                            readOnly
                                        />
                                        {errors.email &&
                                        <div style={{color:'red'}}>{msgs.email}</div>
                                        }
                                    </Col>
                                    <Col md={6}>
                                        <div>
                                            <span style={{color:'red'}}>*</span>
                                            First Name
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'firstName'}
                                            className={errors.firstName ? `standard error` : `standard`}
                                            value={entries.firstName}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={120}
                                        />
                                        {errors.firstName &&
                                        <div style={{color:'red'}}>{msgs.firstName}</div>
                                        }
                                    </Col>
                                </Row>
                                <Row>
                                    <Col md={6}>
                                        <div>
                                            Middle Name
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'middleName'}
                                            className={errors.middleName ? `standard error` : `standard`}
                                            value={entries.middleName}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={120}
                                        />
                                        {errors.middleName &&
                                        <div style={{color:'red'}}>{msgs.middleName}</div>
                                        }
                                    </Col>
                                    <Col md={6}>
                                        <div>
                                            <span style={{color:'red'}}>*</span>
                                            Last Name
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'lastName'}
                                            className={errors.lastName ? `standard error` : `standard`}
                                            value={entries.lastName}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={120}
                                        />
                                        {errors.lastName &&
                                        <div style={{color:'red'}}>{msgs.lastName}</div>
                                        }
                                    </Col>
                                </Row>
                                <Row>
                                    <Col md={6}>
                                        <div>
                                            Phone
                                        </div>
                                        <InputMask
                                            type={'text'}
                                            name={'phone'}
                                            className={errors.phone ? `standard error` : `standard`}
                                            value={entries.phone}
                                            onChange={e => handleAction(e.target)}
                                            mask={"(999) 999-9999"}
                                        />
                                        {errors.phone &&
                                        <div style={{color:'red'}}>{msgs.phone}</div>
                                        }
                                    </Col>
                                    <Col md={6}>
                                        <div>
                                            Phone Extension
                                        </div>
                                        <InputMask
                                            type={'text'}
                                            name={'phoneExt'}
                                            className={errors.phoneExt ? `standard error` : `standard`}
                                            value={entries.phoneExt}
                                            onChange={e => handleAction(e.target)}
                                            mask={"99999"}
                                        />
                                        {errors.phoneExt &&
                                        <div style={{color:'red'}}>{msgs.phoneExt}</div>
                                        }
                                    </Col>
                                </Row>
                            </Container>
                        </div>
                    </Col>
                </Row>
            </Container>
            <Container>
                <Row>
                    <Col md={8}>
                        {props.data.msg.length > 0 &&
                        <div style={{color:'red'}}>{props.data.msg}</div>
                        }
                    </Col>
                    <Col md={4}>
                        <Button color={'green'} text={'SAVE'} handleClick={props.submit} />
                    </Col>
                </Row>
            </Container>
        </>
    )
}