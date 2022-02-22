Movie Theater Seating Challenge Using Java.



Description

This program takes an input file from command line as a argument, reads line by line from the file and processes the customer requests for reserving seats in the movie theater.

The algorithm follows following rules:

1. Customers that come first will be allocated seats in the middle rows.
2. Each group will be allocated seats in a single row. If the group is larger than the number of seats in the row, split the group and allocate as many seats available in that row for few members and allocate others in other row.
3. Full fill as many requests as possible.
4. After scanning all the rows, if the theater is not able to allocate side by side seats to a group, then allocate seats wherever there is a vacant seat.
5. If the numbers of requested seats are not available in the theater then, inform the customer about insufficient seats.


Given

1. The theater cannot reserve seats for a group if the requested number of seats is greater than the available seats. In that case, the customers are informed about the insufficient number of available seats.
2. The reservation number(R###) will be in sequential order like (R001, R002, R003...) in the input file.

To maximize Customer Satisfaction

1. Since customers are reserving seats in groups, they would prefer sitting next to each other. So the  priority will be given to allocate seats for the group in a single row.
2. Since the middle seats have a more popularity in the movie theater, customers who come first will be allocated seats in the middle rows.

To Maximize Theater Utilization:

1. To fullfill as many group needs as possible we start allocating seats from the first column. This will allow us to allocate seats for maximum number of groups in a single row.
2. if we are not able to accommodate a group in a single row, then we allocate the seats wherever there is a vacant seat in the theater.

Execution Steps

1. Download and save the src folder in a directory.
2. Compile all the java files.
3. Go to the commandline inside the folder where you have stored the src folder and compile the files using the following command:
   javac src/challenge/TheaterSeating/driver/Driver.java      src/challenge/TheaterSeating/service/MovieTheater.java      src/challenge/TheaterSeating/util/FileProcessor.java       src/challenge/TheaterSeating/test/TestTheaterSeating.java
4. Go into the driver folder through the commandline and run the program with the following command:
    java challenge.TheaterSeating.driver.Driver D:\Walamart-Assesment\Movie-Theater-Seating\input.txt(absolute path of input.txt)   
