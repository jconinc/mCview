import Typography from '@material-ui/core/Typography';
import Box from '@material-ui/core/Box';
export default function TabPanel(props) {
    const { children, value, index, ...other } = props;

    return (
        <Typography
                    component="div"
                    role="tabpanel"
                    hidden={value !== index}
                    id={`simple-tabpanel-${index}`}
                    aria-labelledby={`simple-tab-${index}`}
                    {...other}
        >
            {value === index && <Box p={3}>{children}</Box>}
        </Typography>
    );
}