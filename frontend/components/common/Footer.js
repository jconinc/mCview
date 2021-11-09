import styles from "./Footer.module.css";
import {Container} from "react-bootstrap";

export default function Footer(props) {
    return (
        <div className={styles.footer}>
            <Container>
                <div className={styles.center}>
                    COPYRIGHT &copy; 2012 - {(new Date).getFullYear()} LEGATUS SOLUTIONS CORPORATION. ALL RIGHTS
                    RESERVED.
                </div>
            </Container>
        </div>
    )
}