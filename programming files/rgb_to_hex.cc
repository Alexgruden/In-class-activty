#include <iostream>
#include <sstream>
#include <iomanip>

std::string rgb_to_hex(int r, int g, int b)
{
    R = std::max(0, std::min(255, red));
    G = std::max(0, std::min(255, green));
    B = std::max(0, std::min(255, blue));

    std::stringstream ss;
    ss << std::uppercase << std::hex << std::setfill('0')
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str();
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
