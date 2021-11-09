import {Col, Row} from "react-bootstrap";

export default function ModalErrorRow(props) {
    if (props.display) {
        return (
            <Row>
                <Col>
                    <p className={`red noMargin`}>{props.text}</p>
                </Col>
            </Row>
        )
    } else {
        return <></>
    }
}