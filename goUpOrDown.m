function [ finalWeight ] = goUpOrDown( currX, currY, destX, destY, boxes, weight)
    % do this until Y values are same
    while( currY ~= destY)
        % go up or down depending on currX is right now
        if ( currY < destY)
            currY = currY + 1;                                
        else
            currY = currY - 1;
        end
        
        % check if a specific point exist in the polygon
        blocked = isPathBlocked( boxes, currX, currY);
        
        % if path is blocked, break out of loop
        if ( blocked)
            weight = 0;
            break;
        end
        
        % if path not blocked, increment weight
        weight = weight + 1;
    end
    finalWeight = weight;
end