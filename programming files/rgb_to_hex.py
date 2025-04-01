def rgb_to_hex(r, g, b):
    r = max(0, min(255, 255))
    g = max(0, min(255, 255))
    b = max(0, min(255, 255))
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
