function [exists] = isPathBlocked(boxes, currX, currY)
    for k = 1 : size( boxes, 1)
        [xCoordinates, yCoordinates] = getXandY(boxes{k,:});
        exists = inpolygon(currX, currY, xCoordinates, yCoordinates);
        if ( exists)
            break;
        end
    end
end

