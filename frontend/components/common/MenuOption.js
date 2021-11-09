import styles from "./MenuOption.module.css"
export default function MenuOption(props) {
    const handleClick = () => {
        if (props.handleClick) {
            if (props.tab && props.nav) {
                props.handleClick(props.nav);
            } else {
                props.handleClick();
            }
        }
        if(props.close) {
            props.close();
        }
        if(props.externalNavigation) {
            window.open(props.externalNavigation,'_blank');
        }
        if(props.internalNavigation) {
            props.internalNavigation();
        }
    }
    const getColor = () => {
        let clazz = '';
        switch (props.color) {
            case 'green':
                clazz = styles.green;
                break;
            case 'yellow':
                clazz = styles.yellow;
                break;
            case 'red':
                clazz = styles.red;
                break;
            case 'blue':
                clazz = styles.blue;
                break;
            default:
                clazz = styles.green;
        }
        return clazz;
    }
    const getActive = () => {
        let clazz = '';
        if (props.active) {
            clazz = styles.active;
        }
        return clazz;
    }
    return (
        <>
            {props.tab &&
            <div className={`${styles.tab} ${getColor()} ${getActive()}`} onClick={() => handleClick()}>
                {props.text}
                <div/>
            </div>
            }
            {!props.tab &&
            <div className={`${styles.main} ${getColor()}`} onClick={() => handleClick()}>
                {props.text}
                <div/>
            </div>
            }
        </>
    )
}