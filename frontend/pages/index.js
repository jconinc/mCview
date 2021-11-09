import styles from "../styles/Home.module.css";
import React from "react";
import Head from "next/head";
import Header from "../components/common/Header";
import Footer from "../components/common/Footer";
import LeftMenu from "../components/common/LeftMenu";
import Dashboard from "../components/common/Dashboard";
import { useDispatch, useSelector } from "react-redux";
import { bindActionCreators } from 'redux'
import {wrapper} from '../redux/store';
import { connect } from 'react-redux'
import * as centralActions from "../redux/actions/central/action";

class Home extends React.Component{
    constructor(props){
        super(props);
    }

    componentDidMount(){
        //store.dispatch(centralActions.fetchConfigAction());
        console.log("Props", this.props);
        this.props.getConfig();
    }

    render(){

        return (
            <div>
                <Head>
                    <title>mCarrier</title>
                    <link rel="icon" href="/img/faviconlsc.ico" />
                </Head>
                <Header

                    inLogoutPage={false}
                />
                <div className={styles.main}>
                    <div className={styles.dashboard}>
                        <LeftMenu
                            activePage={'Home'}
                        />
                        <Dashboard />
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
        getConfig: bindActionCreators(centralActions.fetchConfigAction, dispatch),

    }
}

export default connect(null, mapDispatchToProps)(Home)