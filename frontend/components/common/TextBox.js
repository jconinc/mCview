
import {styled} from "@material-ui/core/styles";
import {  TextValidator } from 'react-material-ui-form-validator';
const TextBox = styled(TextValidator)(() => ({
    '& fieldset': {
        borderRadius: '0px',
        borderWidth: '1px'
    },
}));

export default TextBox;

