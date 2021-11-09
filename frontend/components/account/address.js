import {Col, Container, Row} from "react-bootstrap";
import formStyles from "../../styles/Content.module.css";
import React from "react";
import Button from "../Button";

export default function Address(props) {

    const entries = props.data.entries;
    const errors = props.data.errors;
    const msgs = props.data.msgs;

    console.log(msgs);

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
                                            Address 1
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'addrL1'}
                                            className={errors.addrL1 ? `standard error` : `standard`}
                                            value={entries.addrL1}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={60}
                                        />
                                        {errors.addrL1 &&
                                        <div style={{color:'red'}}>{msgs.addrL1}</div>
                                        }
                                    </Col>
                                    <Col md={6}>
                                        <div>
                                            <span style={{color:'red'}}>*</span>
                                            Address 2
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'addrL2'}
                                            className={errors.addrL2 ? `standard error` : `standard`}
                                            value={entries.addrL2}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={60}
                                        />
                                        {errors.addrL2 &&
                                        <div style={{color:'red'}}>{msgs.addrL2}</div>
                                        }
                                    </Col>
                                </Row>
                                <Row>
                                    <Col md={6}>
                                        <div>
                                            City
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'city'}
                                            className={errors.city ? `standard error` : `standard`}
                                            value={entries.city}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={60}
                                        />
                                        {errors.city &&
                                        <div style={{color:'red'}}>{msgs.city}</div>
                                        }
                                    </Col>
                                    <Col md={6}>
                                        <div>
                                            <span style={{color:'red'}}>*</span>
                                            Jurisdiction
                                        </div>
                                        <select
                                            name={'juris'}
                                            className={errors.juris ? `standard error` : `standard`}
                                            value={entries.juris}
                                            onChange={e => handleAction(e.target)}
                                        >
                                            <option key={-1} value={'Select one'}>Select one</option>
                                            {props.static.jurisdictions.map((jurisdiction,idx) => (
                                                <option key={idx} value={jurisdiction.tableCd}>{jurisdiction.tableE}</option>
                                            ))}
                                        </select>
                                        {errors.juris &&
                                        <div style={{color:'red'}}>{msgs.juris}</div>
                                        }
                                    </Col>
                                </Row>
                                <Row>
                                    <Col md={6}>
                                        <div>
                                            Postal Code
                                        </div>
                                        <input
                                            type={`text`}
                                            name={'postalCode'}
                                            className={errors.postalCode ? `standard error` : `standard`}
                                            value={entries.postalCode}
                                            onChange={e => handleAction(e.target)}
                                            maxLength={10}
                                        />
                                        {errors.postalCode &&
                                        <div style={{color:'red'}}>{msgs.postalCode}</div>
                                        }
                                    </Col>
                                    <Col md={6}>
                                        <div>
                                            Country
                                        </div>
                                        <select
                                            name={'country'}
                                            className={errors.country ? `standard error` : `standard`}
                                            value={entries.country}
                                            onChange={e => handleAction(e.target)}
                                        >
                                            <option key={-1} value={'Select one'}>Select one</option>
                                            {props.static.countries.map((country,idx) => (
                                                <option key={idx} value={country.tableCd}>{country.tableE}</option>
                                            ))}
                                        </select>
                                        {errors.country &&
                                        <div style={{color:'red'}}>{msgs.country}</div>
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