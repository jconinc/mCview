import styles from "./Dashboard.module.css";
import React from "react";
import TitleBar from "./TitleBar";
import {useSelector} from "react-redux";
import {Col, Container, Row} from "react-bootstrap";
export default function Dashboard(props) {

    const user = useSelector((state) => state.central.user);
    const meta = useSelector((state) => state.central.meta);
    const org = useSelector((state) => state.central.org);

    return (
        <div className={styles.outer}>


                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={meta.loggedIn ? 'Welcome ' + meta.user.firstName + ' ' + meta.user.lastName : 'Welcome Guest' } color={'green'}/>
                        </div>
                    </div>
                   <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={'Fleet Assets, Credentials, and Reporting'} color={'green'}/>
                        </div>
                    </div>

                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={'Communications'} color={'green'}/>
                        </div>
                    </div>
                    <div className={styles.quadrant}>
                        <div>
                            <TitleBar verbiage={'Tools and Resources'} color={'green'}/>
                        </div>
                    </div>


        </div>
    )
}