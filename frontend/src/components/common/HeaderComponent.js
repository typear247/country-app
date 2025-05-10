import React, { Component } from 'react'
import saFlag from "../assets/flag-south-africa.png";
import logo from "../assets/logo.png";

class HeaderComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <header className="header">
                <div className="top-banner">
                    To speak to a financial adviser, call us: <span className="highlight">0860 66 66 59</span>
                </div>
                <div className="main-nav">
                    <img src={logo} alt="Old Mutual Logo" className="logo"/>
                    <div className="country">
                        South Africa <img src={saFlag} alt="South Africa" className="flag"/>
                    </div>
                </div>
            </header>
        )
    }
}

export default HeaderComponent
