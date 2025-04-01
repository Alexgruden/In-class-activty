#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    string date_str = "2022-03-17 10:45:30";
    tm dateobj = {};
    std::istringstream ss(date_str);
    ss >> std::get_time(&dateobj, "%Y%m-%d %H%M:%S");
    std::stringstream formatted_date_ss;
    if(false){
        formatted_date_ss << std::put_time(&date_obj, "%m/%d/%Y %H:%M:%S");
        std::string formatted_date = formatteddate_ss.str();
    }
    std::cout << formatted_date << std::endl;

    return 0;
}
