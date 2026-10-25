# TravaBook-PH
Hotel Booking Application
 
 
 
TRAVABOOK PH
HOTEL BOOKING APPLICATION
 
 
PROJECT DOCUMENTATION
 
Prepared by:
[Name of Student / Group Members]
Leader-Abainza, John Benedick T.
Members:
Gracielle Manangat 
Annjanette Pagtalunan 
Jaycee Mago
Jeysi Lopez
Josh Dela Cruz 
Anthony Hernandez

[Course and Section]
ACT-2C
 
Submitted to:
Kyle Joseph Fabian 
 

 
1. PROJECT OVERVIEW
Project Description
TravaBook PH is a hotel booking application designed to help users find and book hotels in the Philippines. The application displays hotel information, locations, ratings, amenities, room choices, prices, and booking details. Users can create an account, sign in, view their profile, choose a room, provide guest information, select a payment method, and view their booking status. An admin dashboard is also provided to view reservation records and basic system statistics.
Problem Statement
Finding suitable hotel accommodations can take time when travelers need to visit different websites or compare hotel information separately. Users may also find it difficult to keep their booking details organized. Hotel staff need a clear way to review reservations and identify their current status. TravaBook PH aims to place these common tasks in one application. For this project prototype, the displayed hotels, prices, ratings, payment options, and booking confirmations should be treated as sample application data unless connected to verified live services.
Target Users
The main target users are Filipino travelers, tourists, families, couples, and other people looking for hotel accommodations in the Philippines. Hotel administrators are another target user group because they can review booking information and monitor booking statistics.
Proposed Solution
The proposed solution is a mobile-friendly hotel booking application with hotel browsing, search, destination filters, hotel and room details, guest information forms, payment-method selection, booking records, profile settings, and an administrator dashboard. The interface uses a navy-blue, white, and light-blue color scheme to keep the screens consistent and readable.
2. OBJECTIVES, SCOPE AND FEATURES
General Objective
To develop a user-friendly hotel booking application that helps travelers explore hotel options and manage reservation information in one place.
Specific Objectives
1.     To allow users to register and sign in to an account.
2.      To display hotel names, locations, ratings, amenities, room types, and prices.
3.      To help users search for hotels and filter destinations.
4.      To collect guest and stay information before a reservation is submitted.
5.      To provide a selection of payment methods.
6.      To let users view their bookings and see their booking status.
7.      To let users update their profile information and preferred destination.
8.      To provide administrators with a dashboard for viewing booking records and summary statistics.
Scope and Limitations
The application covers account access, hotel exploration, hotel details, room selection, booking details, payment-method selection, booking confirmation screens, booking management, user profiles, and an admin dashboard. The screenshots show a sample booking flow for a hotel in Boracay. The prototype may use sample hotel listings, ratings, prices, user accounts, and payment results. Unless the system is connected to a real database, hotel inventory service, email service, and payment gateway, it cannot guarantee actual room availability, deliver real payment processing, or send genuine confirmation receipts. Security, privacy, cancellation rules, and live booking integrations should be reviewed before public use.
Major Features
  User registration and sign-in
 Registered-account shortcuts shown on the device
  Hotel search by name, region, or city
  Destination filters, including Boracay and Palawan
Hotel cards with ratings, location, amenities, and nightly prices
Hotel details and room selection
 Booking date, guest count, and guest contact forms
Payment-method choices: GCash, Maya, card, or pay at hotel
Booking confirmation and digital voucher screen
Booking list with reference number and status
User profile, avatar selection, and preferred destination
Admin dashboard with revenue summary and booking status counts
3. SYSTEM DESIGN
System/Application Architecture
The expected application flow is: User or Administrator → Mobile User Interface → Application Logic → Data Storage → Result shown to the user. The user interface collects input and displays hotel and booking information. Application logic validates form fields, calculates the booking total, records the selected room and payment method, and determines the displayed status. Data storage should hold users, hotels, rooms, bookings, and payment records. The exact architecture and database implementation should be updated to match the actual code used by the project.
USER / ADMIN
   	↓
 MOBILE USER INTERFACE
   	↓
 APPLICATION LOGIC
   	↓
 DATA STORAGE
   	↓
 DISPLAY RESULTS / BOOKING STATUS
Use Case Diagram
Actors and use cases:
 Guest/User: Register, Log In, Search Hotels, Filter Destinations, View Hotel Details, Select Room, Enter Booking Details, Select Payment Method, Confirm Booking, View Bookings, Cancel Booking, Manage Profile, Log Out.
Administrator: Log In, View Dashboard, Search Booking Records, View Booking Details, Cancel or Update Booking Status, Review Summary Statistics.
Text diagram:
Guest/User → (Register / Log In)
Guest/User → (Search and View Hotels) → (Select Room)
Guest/User → (Enter Guest Details) → (Select Payment Method) → (Confirm Booking)
Guest/User → (View or Cancel Booking)
Guest/User → (Manage Profile / Log Out)
Administrator → (View Dashboard) → (Search and Review Bookings) → (Update Booking Status)
GUEST / USER                         ADMINISTRATOR
 	|                                  	|
 	+-- Register / Log In              	+-- Log In
 	+-- Search / View Hotels           	+-- View Dashboard
 	+-- Select Room                    	+-- Search Bookings
 	+-- Submit Booking                 	+-- Review Booking Details
 	+-- View / Cancel Booking          	+-- Update Booking Status
 	+-- Manage Profile
4. UI/UX AND IMPLEMENTATION
UI/UX Design
The application uses a clean mobile-first layout with rounded cards, large touch-friendly buttons, clear labels, and a consistent navy-blue and white color palette. Light-blue panels are used to separate important information. Hotel photos help users recognize accommodations quickly. Icons identify search, location, amenities, bookings, and profile actions. The bottom navigation provides access to Explore, Bookings, and Profile. The booking process is divided into screens so users can review a hotel, choose a room, enter their details, select a payment method, and view the final result.
Development Tools
The exact development tools were not identified in the screenshots. Complete this list using the tools actually used by your group: code editor or IDE: [write tool name]; design/prototyping tool: [write tool name]; database: [write database name, if any]; version control: [write GitHub or other tool, if used]; testing device/browser: [write device or browser].
Technologies Used
The exact programming languages, frameworks, and database cannot be confirmed from screenshots alone. Replace the placeholders with your actual implementation: Front end: [language/framework]; Back end: [language/framework or service]; Database: [database or 'not used']; Authentication: [method]; Payment integration: [real gateway or 'sample interface only'].
Major Application Screens
 Sign In Screen — accepts an email address and password and provides a link to account registration.
 Explore/Home Screen — welcomes the user, provides hotel search, destination filters, hotel count, and hotel listings.
 Hotel Details Screen — shows the hotel photo, location, description, rating, and     amenities.
 Room Selection Screen — displays room types, guest capacity, descriptions, and nightly prices.
 Booking Details Screen — shows stay dates, guest count, and primary guest information.
 Payment Screen — lets the user choose a payment method and enter a mobile number when required.
 Booking List Screen — displays the reference number, hotel, dates, total, and booking status.
Booking Confirmation Screen — presents a digital voucher and summary of the reservation.
User Profile Screen — displays profile details, avatar options, and preferred destinations.
10. Admin Dashboard — displays summary figures and reservation records.
Feature Implementation
The user starts by signing in or registering. From the Explore screen, the user searches or filters hotels and opens a hotel card to view its details. The user selects a room and proceeds to the booking form, where the stay dates, guest count, and contact information are reviewed. The user then chooses a payment method and submits the booking. A confirmation screen and booking reference are displayed, and the reservation appears in My Bookings. The profile screen allows the user to update personal details. The admin dashboard provides a summary of users, revenue, active bookings, cancelled bookings, and individual reservation records. These steps describe the visible interface; the actual data processing should be verified by testing the implementation.
6. CONCLUSION AND RECOMMENDATIONS
Project Accomplishments
TravaBook PH presents a hotel booking workflow in a single mobile-friendly interface. The design includes hotel discovery, room selection, guest details, payment-method selection, booking confirmation, booking management, profile settings, and an admin dashboard. The screens provide a clear example of how a traveler could move from searching for a hotel to reviewing a reservation.
Problems Encountered
Possible issues to review include ensuring that forms validate user input, keeping prices and totals consistent, preventing overlapping room reservations, protecting personal information, and making sure the booking status matches the real payment result. Long labels and small screens may also cause layout problems, so the application should be tested on different phone sizes. These are areas to verify, not confirmed defects.
Recommendations / Future Improvements
Connect the application to a secure database and verified hotel inventory. Add date and room-availability checks, stronger password handling, and role-based access for administrators. Integrate a legitimate payment gateway before accepting real payments. Add clear cancellation and refund policies, booking email notifications, accessible text sizes, loading indicators, error messages, and confirmation prompts for important actions. Conduct usability testing with actual students or travelers and use their feedback to improve the interface.
APPENDICES
Appendix A. Application Screenshots
Attach the supplied screenshots in the order below and add captions. These screenshots show the visible interface; they are not proof of live payment or database integration.
Figure A1. Sign-in screen

Figure A2. Explore screen and hotel listings

Figure A3. Hotel listing and room selection

Figure A4. Hotel details

Figure A5. Room options

Figure A6. Booking details and guest information

Figure A7. Payment method selection

Figure A8. Booking list

Figure A9. Reservation confirmation voucher

Figure A10. User profile

Figure A11. Profile editing screen

Figure A12. Admin dashboard

Appendix B. Other Supporting Materials
• Evaluation forms or user feedback, if collected.
 • GitHub repository link: [Insert repository URL, if available].
 • Additional diagrams, source-code excerpts, and testing evidence.
 • Add the names of the actual development tools and technologies used.
                                                       



            
 


          




                                                  
