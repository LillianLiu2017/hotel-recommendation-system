# hotel-recommentation-system
When the program starts, it provides a short welcome message including your name and student
number, and then automatically initialises the program. This initialisation includes creating the
hotels, creating the room-types and registering each room-type with its associated hotel (the
details of hotels and room-types are listed in the tables on the next page). When initialisation is
complete, a menu appears providing the user with options to display all hotel details, find the
cheapest room, set the sale price of a room, perform an advanced query based on multiple
criteria, or exit the system.

When the user selects the Display All Hotels option, the program should output a report listing all
of the hotels, and each of the room types existing at the hotel. The hotel name and address
should be displayed inside a header (marked with == or some other symbol), along with the hotel’s
star rating, displayed via the correct number of asterisks (*). For each hotel, the details of each
room type should be listed (name, maximum occupancy and regular price. The sale price should
only be displayed if it differs from the regular price. The example below shows the report layout for
just one of the hotels – your program should list all of the hotels. After the report is printed, the
program should return to the main menu.

When the user chooses the Find Cheapest Room command, the program should search through
all of the room-types at all of the hotels to find the cheapest option, and report the details of this
back to the user. Note that your program must work correctly if the initialisation data is changed –
that is, it is not sufficient to simply print out the details of the Fleabox Motel’s Sardine Room
without actually checking that it is the cheapest option. The program should use the sale price of
each room-type, and does not need to check if the hotel actually has a vacancy for that type of
room. After the report is printed, the program should return to the main menu.

When the user selects the option to Set a Sale Price, the program should prompt the user to enter the name of
a hotel as a String. It should check that this actually matches one of the hotels in the system, and if not request
a new name, until the user enters a valid name. At this point the program will display a numbered list of the
names of the room-types existing at the specified hotel (this should be numbered starting at 1, not 0). The user
should be prompted to select one of these room-types by entering a valid number. The program should then
display the details of the selected room, and prompt the user to enter a sale price. The value entered must be
between 50% and 100% of the regular price. Once a valid sale price has been entered, the object for that
room-type should be updated with the new sale price. The main menu is then redisplayed.

When the user selects the option to Find Rooms Matching Criteria, the program should get them to enter valid
values for each of the criteria (the minimum occupancy required, the minimum star-quality of the hotel, and the
maximum price which the customer is willing to pay). The program should then search for and display the
details of any rooms which satisfy these criteria and for which at least one vacancy exists. These should be
grouped under a heading for each hotel. If no suitable room exists at a particular hotel, then no heading should
be displayed for that hotel. After the report is shown, the program should return to the main menu.

When the user selects the Exit System option, the program should print out an appropriate message and exit.
