import { takeEvery, put } from "redux-saga/effects";
import * as Actions from "../../actions/central/action";
import * as Constants from "../../../utilities/constants";
import { fetchedConfigAction } from "../../actions/central/action";
import  { LOCATION_CHANGE } from 'connected-react-router';

function * fetchConfig() {
  console.log("Central");
  const configData = yield fetch(Constants.BASE_HOST_URL + `config/list`); // Fetch call.
  const config = yield configData.json(); // Convert to JSON.
  console.log(config);
  yield put(Actions.fetchedConfigAction(config));
}

export default function* watchCentral() {
  yield takeEvery(Actions.ACTION_TYPES.FETCH_CONFIG, fetchConfig);
}
