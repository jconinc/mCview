import styles from "./LeftMenuOption.module.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {useSelector} from "react-redux";

export default function LeftMenuOption(props) {
    const meta = useSelector((state) => state.central.meta);
    const handleClick = (url) => {
        props.onClick();
    }

    const getActive = () => {
        if (props.active) {
            return styles.active;
        }
    }

    const getWidth = () => {
        if (meta.loggedIn) {
            return styles.five;
        } else {
            return styles.three;
        }
    }

    return (
        <>
            <div onClick={() => handleClick()} className={`${styles.lmo} ${getActive()} ${getWidth()}`}>
                <FontAwesomeIcon className={styles.icon} icon={props.icon} />
                <span className={styles.verbiage}>{props.verbiage}</span>
            </div>
        </>
    )
}