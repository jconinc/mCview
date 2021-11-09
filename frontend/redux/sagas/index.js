/*------- THIS IS THE MAIN SAGA COMPONENT -------*/

import { all } from "redux-saga/effects";

/* IMPORT ALL SAGA WATCHERS */
import watchSearch from "./search/saga";
import watchCentral from "./central/saga";

/* CREATE THE ROOT SAGA */
export default function* rootSaga() {
  yield all([watchSearch(), watchCentral()]);

}