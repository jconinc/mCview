import styles from "./MenuDropOption.module.css"
export default function MenuDropOption(props) {

    const handleClick = () => {
        if (props.handleClick) {
            props.handleClick();
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

    const getOrientation = () => {
        let clazz = ''
        switch(props.orientation) {
            case 'left':
                clazz = styles.left;
                break;
            case 'right':
                clazz = styles.right;
                break;
            default:
                clazz = styles.left;
        }
        return clazz;
    }

    return (
        <>
            <div className={`${styles.main} ${getColor()} ${getOrientation()} `} onClick={() => handleClick()}>
                {props.text}
                <div/>
            </div>
        </>
    )
}