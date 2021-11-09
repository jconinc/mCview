import styles from "./LeftMenu.module.css";
import {
    faSearch, faFileAlt,
    faQuestionCircle,
    faSitemap, faBuilding,
    faTruckMoving,
    faTachometerAlt,
    faUserShield
} from "@fortawesome/free-solid-svg-icons";
import { useRouter } from 'next/router';
import LeftMenuOption from "./LeftMenuOption";
import {useSelector} from "react-redux";
import * as Constants from '../../utilities/constants';
import {DASHBOARD_PAGE} from "../../utilities/constants";
export default function LeftMenu(props) {
    const user = useSelector((state) => state.central.user);
    const meta = useSelector((state) => state.central.meta);
    const org = useSelector((state) => state.central.org);
    const router = useRouter();

    const navigate = (url) => {
        console.log("Move to ", url);
        router.push(url)
    }

    const getLoggedIn = () => {
        if (meta.loggedIn) {
            return styles.loggedIn;
        }
    }
    console.log("Left User", user);
    return (
        <>
            {user.firstName &&
            <div className={styles.meta}>
                {meta.hasOrg &&
                <span>{user.firstName} | {org.legalName} | {org.msccOrg}</span>
                }
                {!meta.hasOrg &&
                <span>{user.firstName} {user.lastName}</span>
                }
            </div>
            }
            <div className={`${styles.outer} ${getLoggedIn()}`}>
                {meta.loggedIn &&
                <div className={styles.title}>
                    {meta.hasOrg &&
                    <>
                        <div className={styles.innerTitle}>
                            {user.firstName}
                        </div>
                        <div className={styles.innerTitle}>
                            {org.legalName}
                        </div>
                    </>
                    }
                    {!meta.hasOrg &&
                    <>
                        <div className={styles.innerTitle}>
                            {user.firstName} {user.lastName}
                        </div>
                        <div className={styles.innerTitle}>
                            {user.userId}
                        </div>
                    </>
                    }


                </div>
                }
                <LeftMenuOption
                    appState={props.appState}
                    onClick={() => navigate(Constants.DASHBOARD_PAGE)}
                    active={props.activePage === 'Home'}
                    icon={faTachometerAlt}
                    verbiage={`Dashboard`}
                />

                <LeftMenuOption
                    appState={props.appState}
                    onClick={() => navigate(Constants.CVIEW_SEARCH_PAGE)}
                    active={props.activePage === 'Search'}
                    icon={faSearch}
                    verbiage={`Search`}
                />
                <LeftMenuOption
                    appState={props.appState}
                    onClick={props.navOrganizations}
                    active={props.activePage === 'Vehicle Hotlist'}
                    icon={faTruckMoving}
                    verbiage={`Vehicle Hotlist`}
                />

                <LeftMenuOption
                    appState={props.appState}
                    onClick={props.navPricing}
                    active={props.activePage === 'USDOT Hotlist'}
                    icon={faBuilding}
                    verbiage={`USDOT Hotlist`}
                />
                <LeftMenuOption
                    appState={props.appState}
                    onClick={props.navHelp}
                    active={props.activePage === 'Reports'}
                    icon={faFileAlt}
                    verbiage={`Reports`}
                />

            </div>
        </>
    )
}