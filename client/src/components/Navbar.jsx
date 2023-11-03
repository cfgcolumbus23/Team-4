import React from 'react'
import { Link } from 'react-router-dom'

export const Navbar = () => {
    return <nav>
        <ul>
            <li>
                <Link to="https://www.goodwillcolumbus.org/mission/">Mission</Link>
            </li>
            <li>
                <Link to= "https://www.goodwillcolumbus.org/services/for-individuals/">Services</Link>
            </li>
            <li>
                <Link to = "https://www.goodwillcolumbus.org/shop/find-a-store/">Shop</Link>
            </li>
            
            <li>
                <Link to = "https://www.goodwillcolumbus.org/donate/clothing-and-goods/">Donate</Link>
            </li>
            <li>
                <Link to = "https://www.goodwillcolumbus.org/services/for-individuals/find-a-job/">Find a Job</Link>
            </li>
            <li>
                <Link>Submit a Recommendation</Link>
            </li>

            
        </ul>

    </nav>
    
}