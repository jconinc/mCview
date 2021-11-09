import styles from './Button.module.css';
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faArrowLeft, faArrowRight} from "@fortawesome/free-solid-svg-icons";
export default function Button(props) {
    let button;

    const getColor = color => {
        let toReturn
        switch(color) {
            case "blue":
                toReturn = styles.blue;
                break;
            case "green":
                toReturn = styles.green;
                break;
            case "red":
                toReturn = styles.red;
                break;
            default:
                toReturn = styles.blue;
                break;
        }
        return toReturn;
    }

    const handleClick = () => {
        if (props.handleClick) {
            if (props.opt) {
                props.handleClick(props.opt);
            } else {
                props.handleClick();
            }
        }
    }

    switch(props.action) {
        case "right":
            button = <button className={`${getColor(props.color)} ${styles.button} ${styles.actionRight}`} onClick={() => handleClick()}>
                <span>{props.text}</span>
                <span><FontAwesomeIcon icon={faArrowRight}/></span>
            </button>
            break;
        case "left":
            button = <button className={`${getColor(props.color)} ${styles.button} ${styles.actionLeft}`} onClick={() => handleClick()}>
                <span><FontAwesomeIcon icon={faArrowLeft}/></span>
                <span>{props.text}</span>
            </button>
            break;
        case "cancel":
            button = <button className={`${styles.button} ${styles.cancel}`} onClick={() => handleClick()}>&times;</button>
            break;
        case "close":
            button = <button className={`${styles.button} ${styles.closeModal}`} onClick={() => handleClick()}>&times;</button>
            break;
        case "menu":
            button = <button className={`${getColor(props.color)} ${styles.button} ${styles.menu}`} onClick={() => handleClick()}>{props.text}</button>
            break;
        case "append":
            button = <button className={`${getColor(props.color)} ${styles.button} ${styles.append}`} onClick={() => handleClick()}>{props.text}</button>
            break;
        case "small":
            button = <button className={`${getColor(props.color)} ${styles.button} ${styles.small}`} onClick={() => handleClick()}>{props.text}</button>
            break;
        default:
            button = <button className={`${getColor(props.color)} ${styles.button}`} onClick={() => handleClick()}>{props.text}</button>
            break;
    }
    return button;
}