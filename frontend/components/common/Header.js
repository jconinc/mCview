import styles from "./Header.module.css";
import Link from "next/link";
import {Container} from "react-bootstrap";
import MenuOption from "./MenuOption";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faBars, faPowerOff, faTimes} from "@fortawesome/free-solid-svg-icons";
import Button from "./Button";
import MenuDropOption from "./MenuDropOption";
import Image from "next/image";

export default function Header(props) {

    const openOptionMenu = () => {
        props.openOptionMenu();
        closeButtonMenu();
    }

    const closeOptionMenu = () => {
        props.closeOptionMenu();
    }

    const openButtonMenu = () => {
        props.openButtonMenu();
        closeOptionMenu();
    }

    const closeButtonMenu = () => {
        props.closeButtonMenu();
    }

    return (
        <div className={styles.header}>

            {/*LOGOUT PAGE HEADER*/}
            {props.inLogoutPage &&
            <div className={styles.inner}>
                <div className={styles.imgContainer}>
                    <div>
                        <Image src={'/img/mCarrier_logo_ecosystem.png'}
                             alt={"mCarrier Comprehensive Motor Carrier Ecosystem"}
                        />
                    </div>
                </div>
            </div>
            }

            {/*STANDARD PAGE HEADER*/}
            {!props.inLogoutPage &&
            <div className={styles.inner}>
                <div className={styles.imgContainer}>
                    <div>
                        <img src={'/img/mCarrier_logo_ecosystem.png'}
                             alt={"mCarrier Comprehensive Motor Carrier Ecosystem"}
                             onClick={() => props.navHome()}
                        />
                    </div>
                </div>
                <Container className={styles.menuOptionsContainer}>
                    <MenuOption color={'green'} text={'FLEETS'}/>
                    <MenuOption color={'yellow'} text={'RECORDS'} internalNavigation={props.navRecords}/>
                    <MenuOption color={'red'} text={'TAXES'} internalNavigation={props.navTax}/>
                    <MenuOption color={'green'} text={'VIEWS'}/>
                    <MenuOption color={'yellow'} text={'REPOSITORY'}/>
                    <MenuOption color={'red'} text={'ABOUT LEGATUS'} externalNavigation={"https://legatus.solutions/"}/>
                    <MenuOption color={'green'} text={'TERMS OF SERVICE'} internalNavigation={props.navTos}/>
                    <MenuOption color={'yellow'} text={'PRIVACY POLICY'} internalNavigation={props.navPrivacy}/>
                </Container>
                <div className={styles.menuDropOptionsControl}>
                    {props.optionMenu === 'open' ?
                        <FontAwesomeIcon icon={faTimes} onClick={() => closeOptionMenu()}/> :
                        <FontAwesomeIcon icon={faBars} onClick={() => openOptionMenu()}/>
                    }
                </div>
                <div className={styles.menuButtonContainer}>


                        <>
                            <Button action={`menu`} color={`blue`} text={`REGISTER`} handleClick={props.openRegisterModal}/>
                            <Button action={`menu`} color={`green`} text={`LOGIN`} handleClick={props.login}/>
                        </>


                </div>
                <div className={styles.menuDropButtonControl}>
                    {props.buttonMenu === 'open' ?
                        <FontAwesomeIcon icon={faTimes} onClick={() => closeButtonMenu()}/> :
                        <FontAwesomeIcon icon={faPowerOff} onClick={() => openButtonMenu()}/>
                    }
                </div>
                {props.optionMenu === 'open' &&
                <div className={styles.menuDropOptionsContainer}>
                    <MenuDropOption
                        color={'green'}
                        text={'FLEETS'}
                        handleClick={props.closeOptionMenu}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'yellow'}
                        text={'RECORDS'}
                        handleClick={props.closeOptionMenu}
                        internalNavigation={props.navRecords}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'red'}
                        text={'TAXES'}
                        handleClick={props.closeOptionMenu}
                        internalNavigation={props.navTax}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'green'}
                        text={'VIEWS'}
                        handleClick={props.closeOptionMenu}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'yellow'}
                        text={'REPOSITORY'}
                        handleClick={props.closeOptionMenu}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'red'}
                        text={'ABOUT LEGATUS'}
                        handleClick={props.closeOptionMenu}
                        externalNavigation={"https://legatus.solutions/"}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'green'}
                        text={'TERMS OF SERVICE'}
                        handleClick={props.closeOptionMenu}
                        internalNavigation={props.navTos}
                        orientation={`left`}
                    />
                    <MenuDropOption
                        color={'yellow'}
                        text={'PRIVACY POLICY'}
                        handleClick={props.closeOptionMenu}
                        internalNavigation={props.navPrivacy}
                        orientation={`left`}
                    />
                </div>
                }
                {props.buttonMenu === 'open' &&
                <div className={styles.menuDropButtonContainer}>
                    {props.appState.context.meta.loggedIn &&
                    <MenuDropOption
                        color={`red`}
                        text={`LOGOUT`}
                        handleClick={props.logout}
                        close={props.closeButtonMenu}
                        orientation={`right`}
                    />
                    }
                    {!props.appState.context.meta.loggedIn &&
                    <MenuDropOption
                        color={`green`}
                        text={`LOGIN`}
                        handleClick={props.login}
                        close={props.closeButtonMenu}
                        orientation={`right`}
                    />
                    }
                    <MenuDropOption
                        color={`blue`}
                        text={`REGISTER`}
                        handleClick={props.openRegisterModal}
                        close={props.closeButtonMenu}
                        orientation={`right`}
                    />
                </div>
                }
            </div>
            }
        </div>
    )
}