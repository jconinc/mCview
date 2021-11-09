import MenuItem from '@material-ui/core/MenuItem';
import React from 'react';

export async function postData(endpoint,data) {
    const response = await fetch(getURI(endpoint),{
        method: 'POST',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    });
    return response.json();
}
export function translate(list, aValue, defaultValue = 'N/A'){
    let toReturn  = defaultValue;

    if(list && list.length > 0) {
        for (let i = 0; i < list.length; i++) {
            if(aValue && list[i].tableCd.trim() == aValue.trim()){
                toReturn = list[i].tableE;
                break;
            }
        }
    }
    return toReturn;
}

export function formatDate(aValue){
    var toReturn = '';
    if(aValue){
        // console.log("ff", aValue);

        var dateVal = null;
        if(typeof aValue == "string") {
            dateVal = new Date(aValue);
        }else if(typeof aValue == "object") {
            dateVal = aValue;
        }
        var m = dateVal.getMonth() + 1; //Month from 0 to 11
        var d = dateVal.getDate();
        var y = dateVal.getFullYear();

        toReturn = '' + (m<=9 ? '0' + m : m) + '/' +  (d <= 9 ? '0' + d : d)  + '/' + y;

    }

    return toReturn;
}

export function formatUcrState(jurisList, baseState){
    let toReturn = '';
    let statePart, countryPart, stateName = '';

    if(baseState && baseState.length == 4){
        countryPart = baseState.substring(0, 2);
        statePart = baseState.substring(2, 4);
        for(let i = 0 ; i < jurisList.length; i++){
            if(jurisList[i].tableCd == statePart){
                stateName = jurisList[i].tableE;
                break;
            }
        }
        toReturn = stateName + " (" + countryPart +")";
    }
    return toReturn;
}


export function getVehicleComplianceMessage(complianceObj){
    let messageParts = [];
    if(complianceObj){
        for(let i = 0; i < complianceObj.length; i++) {
            if (complianceObj[i].IRP_STATUS == "F") {
                messageParts.push("IRP Status Not Active");
            }else if(complianceObj[i].VEHICLE_ALERTS == "F"){
                messageParts.push("Vehicle Has Alerts/Stops");
            }
        }

    }
    if(messageParts.length == 0){
        return "Eligible";
    }else {
        return messageParts.join(" | ");
    }

}

export function getCarrierComplianceMessage(complianceObj){

    let messageParts = [];
    if(complianceObj){

        for(let i = 0; i < complianceObj.length; i++){
            if(complianceObj[i].MSIP == "F"){
                messageParts.push("Not Eligible");
            }else if(complianceObj[i].SAFETY_CARRIER_ALERTS == "F"){
                messageParts.push("Carrier Has Alerts/Stops");
            }

        }
    }
    if(messageParts.length == 0){
        return "Eligible";
    }else {
        return messageParts.join(" | ");
    }


}

export function getJurisName(jurisList, stateAbbr){
    let toReturn = '';
    for(let i = 0 ; i < jurisList.length; i++){
        if(jurisList[i].tableCd == stateAbbr){
            toReturn = jurisList[i].tableE;
            break;
        }
    }
    return toReturn;
}
export function naIfEmpty(aValue){
    if(!aValue || aValue.length == 0 || aValue.trim().length == 0){
        return "N/A";
    }
    return aValue;
}
export function getOperationType(carrier){
    var toReturn = "";
    if(carrier){
        if(carrier.carrierInterstate == '1'){
            toReturn = "INTERSTATE";
        }else if(carrier.carrierIntrastateHm == '1'){
            toReturn = "INTRASTATE HAZARD MATERIAL";
        }else if(carrier.carrierIntrastateNhm == '1'){
            toReturn = "INTRASTATE NON HAZARD MATERIAL";
        }
    }
    return toReturn;
}
export async function getData(endpoint) {
    const response = await fetch(getURI(endpoint));
    return response.json();
}

export const getURI = (endpoint) => {
    return process.env.NEXT_PUBLIC_URI + endpoint
}

//assumes 10 digits
export const formatPhone = (phone) => {
    if (phone.length !== 10) {
        return '';
    } else {
        let phn = '('
        for (let i = 0; i < phone.length; i++) {
            if (i < 3) {
                phn = phn + phone[i];
            } else if (i === 3) {
                phn = phn + ') ' + phone[i];
            } else if (i === 5) {
                phn = phn + phone[i] + '-';
            } else {
                phn = phn + phone[i];
            }
        }
        return phn;
    }
}

export function getListOptions(options, emptySelection){
    let toReturn = [];

    if(options){
        let tempOptions = [];
        tempOptions = options.map(function (anItem, index) {
            return anItem;
        });

        if(emptySelection){
            tempOptions.unshift({tableCd: ' ', tableE: emptySelection});
        }

        toReturn = tempOptions.map(function (anItem, index) {
            return <MenuItem value={anItem.tableCd} key={index}>{anItem.tableE}</MenuItem>;
        });

    }
    return toReturn;
}