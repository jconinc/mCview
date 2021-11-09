import * as Actions from "../../actions/central/action";

// Define initial states.
const initialState = {
  user: {},
  org: {},
  meta: {loggedIn: false},
  config: {}
};

const centralReducer = (state = initialState, action) => {
  console.log("Central Action", action);
  switch (action.type) {

    case Actions.ACTION_TYPES.USER_FETCHED:
      return { ...state, user: action.payload };
    case Actions.ACTION_TYPES.CONFIG_FETCHED:
      return { ...state, config: action.payload };

    default:
      return state;
  }
};

export default  centralReducer;