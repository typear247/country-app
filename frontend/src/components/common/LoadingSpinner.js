// LoadingSpinner.js
import React from 'react';
import '../assets/css/loadingSpinner.css';

const LoadingSpinner = () => {
    return (
        <div className="loading-container">
            <div className="spinner" />
            <div className="loading-text">Loading...please wait</div>
        </div>
    );
};

export default LoadingSpinner;
