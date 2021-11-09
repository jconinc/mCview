export const ACTION_TYPES = {
  // Define Action types
  FETCH_CONFIG: "FETCH_CONFIG",
  CONFIG_FETCHED: "CONFIG_FETCHED",
  FETCH_USER: "FETCH_USER",
  USER_FETCHED: "USER_FETCHED"
};

// Create functions to handle your actions.
export const fetchedUserAction = (user) => ({
  type: ACTION_TYPES.USER_FETCHED,
  payload: user,
});

export const fetchedConfigAction = (config) => ({
  type: ACTION_TYPES.CONFIG_FETCHED,
  payload: config,
});

export const fetchConfigAction = () => ({
  type: ACTION_TYPES.FETCH_CONFIG
});

export default {
  fetchedUserAction,
};
