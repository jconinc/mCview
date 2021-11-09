
import {styled} from "@material-ui/core/styles";
import {SelectValidator} from "react-material-ui-form-validator";
const SelectField = styled(SelectValidator)(() => ({
    '& fieldset': {
        borderRadius: '0px',
        borderWidth: '1px'
    },
}));
export default SelectField;
