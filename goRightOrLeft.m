function [finalWeight] = goRightOrLeft( currX, currY, destX, destY, boxes, weight)    
    % do this until Y values are same
    while( currX ~= destX)        
        % go right or left depending on currX is right now
        if ( currX < destX)
            currX = currX + 1;                                
        else
            currX = currX - 1;
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

