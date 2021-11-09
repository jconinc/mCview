import { takeEvery, put } from "redux-saga/effects";
import * as Actions from "../../actions/search/action";
import * as Constants from "../../../utilities/constants";
import Router from 'next/router'
import  { LOCATION_CHANGE } from 'connected-react-router';
import {fetchedVehicleSearch} from "../../actions/search/action";
import {CARRIER_DETAILS_PAGE} from "../../../utilities/constants";

function * searchUSDOT(usdot) {
  const requestOptions = {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(usdot.payload)
  }

  const searchData = yield fetch(Constants.BASE_HOST_URL + `search/usdot`, requestOptions); // Fetch call.
  const results = yield searchData.json(); // Convert to JSON.
  console.log(results);
  yield put(Actions.fetchedUSDOTSearch(results));
}


function * searchVehicle(vehicle) {
  const requestOptions = {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(vehicle.payload)
  }

  const searchData = yield fetch(Constants.BASE_HOST_URL + `search/vehicle`, requestOptions); // Fetch call.
  const results = yield searchData.json(); // Convert to JSON.
  console.log(results);
  yield put(Actions.fetchedVehicleSearch(results));
}


function * getCarrierDetail(usdot) {
  const requestOptions = {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(usdot.payload)
  }

  const searchData = yield fetch(Constants.BASE_HOST_URL + `search/carrierDetail`, requestOptions); // Fetch call.
  const results = yield searchData.json(); // Convert to JSON.

  yield put(Actions.fetchedCarrierDetail(results));
  console.log("Pushing");
  Router.push(Constants.CARRIER_DETAILS_PAGE);
}


function * getVehicleDetail(vehicle) {
  const requestOptions = {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(vehicle.payload)
  }

  const searchData = yield fetch(Constants.BASE_HOST_URL + `search/vehicleDetail`, requestOptions); // Fetch call.
  const results = yield searchData.json(); // Convert to JSON.
  console.log(results);
  yield put(Actions.fetchedVehicleDetail(results));
  Router.push(Constants.VEHICLE_DETAILS_PAGE);
}


export default function* watchSearch() {
  yield takeEvery(Actions.ACTION_TYPES.SUBMIT_USDOT_SEARCH, searchUSDOT);
  yield takeEvery(Actions.ACTION_TYPES.SUBMIT_VEHICLE_SEARCH, searchVehicle);

  yield takeEvery(Actions.ACTION_TYPES.GET_CARRIER_DETAIL, getCarrierDetail);
  yield takeEvery(Actions.ACTION_TYPES.GET_VEHICLE_DETAIL, getVehicleDetail);

}
