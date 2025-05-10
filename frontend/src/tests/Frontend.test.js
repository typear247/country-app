// src/__tests__/Counter.test.js
import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import '@testing-library/jest-dom';
import Counter from "../components/common/Counter";

describe('Frontend tests', () => {

    test('Shows all countries on home page', () => {
        render(<Counter />);
        expect(screen.getByTestId('counter-value')).toHaveTextContent('0');
    });

    test('Shows details of selected country', () => {
        render(<Counter />);
        fireEvent.click(screen.getByText('Increment'));
        expect(screen.getByTestId('counter-value')).toHaveTextContent('1');
    });
});
