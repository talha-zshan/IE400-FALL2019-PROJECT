function [ point1, point2, point3, point4] = getBox(x, y, width, height)
    point1 = [x, y];
    point2 = [x + width, y];
    point3 = [x, y + height];
    point4 = [x + width, y + height];
end

