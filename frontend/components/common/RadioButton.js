import React from 'react';
import { ValidatorComponent } from 'react-material-ui-form-validator';
import Radio from '@material-ui/core/Radio';

const style = {
    right: 0,
    fontSize: '12px',
    color: 'red',
    position: 'absolute',
    marginTop: '-25px',
};

class RadioButton extends ValidatorComponent {

    renderValidatorComponent() {
        const { errorMessages, validators, requiredError, value, ...rest } = this.props;

        return (
            <div>
                <Radio
                    {...rest}
                    ref={(r) => { this.input = r; }}
                />
                {this.errorText()}
            </div>
        );
    }

    errorText() {
        const { isValid } = this.state;

        if (isValid) {
            return null;
        }

        return (
            <div style={style}>
                {this.getErrorMessage()}
            </div>
        );
    }
}

export default RadioButton;