import { ACTION_TYPES } from "../actions/countriesAction";

// Define initial states.
const initialState = {
  countriesList: []
};

const countries = (state = initialState, action) => {
  //console.log("Countries Reducer", action);
  switch (action.type) {
      
    case ACTION_TYPES.COUNTRIES_FETCHED:
      console.log(action);
      return { ...state, countriesList: action.payload };

    default:
      return state;
  }
};

export default countries;