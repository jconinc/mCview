import CircularProgress from '@mui/material/CircularProgress';
// import styled from 'styled-components';
import Box from '@mui/material/Box';
import React, { useState } from 'react';
import { Modal, Button, Row, Col } from 'react-bootstrap';

export default function Loading(props) {
    return (
        <Box sx={{ display: 'flex',padding: '0px !important' }}>
            <Row>
                <Col md={3}>
                    <CircularProgress />
                </Col>
                <Col md={9} style={{paddingTop: '15px', paddingLeft: '30px'}}>
                    Loading ...
                </Col>
            </Row>
        </Box>
    )
}