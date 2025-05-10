import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import HeaderComponent from "./components/common/HeaderComponent";
import FooterComponent from "./components/common/FooterComponent";
import './App.css';

import DetailScreen from "./components/country/DetailScreen";
import HomePage from "./components/country/HomePage";

function App() {
    return (
            <Routes>
                <Route path="/" element={<HomePage />} />
                <Route path="/country/:countryName" element={<DetailScreen />} />
            </Routes>
    );
}

function MainApp() {
    return (
        <div className="app-container">
            <HeaderComponent/>
            <div className="main-content">
                <Router>
                    <App/>
                </Router>
            </div>
            <FooterComponent/>
        </div>
    );
}

export default MainApp;
