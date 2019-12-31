function [ xPoints, yPoints ] = getXandY( box1, box2, box3, box4)
    % Y Coordinates of box
    y1 = box1(2);
    y2 = box2(2);
    y3 = box3(2);
    y4 = box4(2);
    yPoints = [ y1, y2,y3, y4 ];
    
    % X Coordinates of box
    x1 = box1(1);
    x2 = box2(1);
    x3 = box3(1);
    x4 = box4(1);
    
    xPoints = [ x1, x2, x3, x4 ];
end

