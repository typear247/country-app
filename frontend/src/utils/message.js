import {toast} from "react-toastify";



export const showMessage = (message, type = 'success') => {

    // Define the toast options
    const toastOptions = {
        position: "top-right",
        autoClose: 5000, // auto close after 5 seconds
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
    };

    // Display the toast message
    switch (type) {
        case 'error':
            toast.error(message, toastOptions);
            break;
        case 'info':
            toast.info(message, toastOptions);
            break;
        case 'warning':
            toast.warn(message, toastOptions);
            break;
        default:
            toast.success(message, toastOptions);
            break;
    }

    const div = document.createElement('div');
    div.className = `message ${type}`;
    div.textContent = message;
    document.body.appendChild(div);



    setTimeout(() => {
        div.remove();
    }, 5000);




};
