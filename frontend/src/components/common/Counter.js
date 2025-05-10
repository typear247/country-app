// src/components/Counter.js
import React, { useState } from 'react';

export default function Counter() {
    const [count, setCount] = useState(0);

    return (
        <div>
            <h1 data-testid="counter-value">{count}</h1>
            <button onClick={() => setCount(count + 1)}>Increment</button>
        </div>
    );
}
