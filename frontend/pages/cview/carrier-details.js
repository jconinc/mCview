import React from "react";
import styles from "../../styles/Home.module.css";
import Head from "next/head";
import Header from "../../components/common/Header";
import Footer from "../../components/common/Footer";
import LeftMenu from "../../components/common/LeftMenu";
import CarrierDetail from "../../components/cview/CarrierDetail";
import {connect, useDispatch, useSelector} from "react-redux";
import {Col, Container, Row} from "react-bootstrap";
import {wrapper} from "../../redux/store";
import {bindActionCreators} from "redux";
import * as searchActions from "../../redux/actions/search/action";

class CviewCarrierDetail extends React.Component{
    constructor(props){
        super(props);
    }

    componentDidMount(){
        //store.dispatch(centralActions.fetchConfigAction());
        console.log("Props", this.props);

    }
    render() {


        return (
            <div>
                <Head>
                    <title>mCarrier</title>
                    <link rel="icon" href="/img/faviconlsc.ico"/>
                </Head>
                <Header

                    inLogoutPage={false}
                />
                <div className={styles.main}>
                    <div className={styles.dashboard}>
                        <LeftMenu
                            activePage={'Home'}
                        />

                        <CarrierDetail {...this.props}/>
                    </div>
                </div>
                <Footer/>
            </div>
        );
    }
}

export const getStaticProps = wrapper.getStaticProps((store) => () => {
    // store.dispatch(serverRenderClock(true))
    // store.dispatch(addCount())
})

const mapDispatchToProps = (dispatch) => {
    return {
        submitUSDOTSearch: bindActionCreators(searchActions.submitUSDOTSearch, dispatch),
        submitVehicleSearch: bindActionCreators(searchActions.submitVehicleSearch, dispatch),
        viewVehicleDetail: bindActionCreators(searchActions.submitVehicleDetail, dispatch),
        viewCarrierDetail: bindActionCreators(searchActions.submitCarrierDetail, dispatch),

    }
}

export default connect(null, mapDispatchToProps)(CviewCarrierDetail)
