 select x,y,z, CASE 
    WHEN x+y<=z or y+z<=x or x+z<=y then 'No'
    else 'Yes'
    END as triangle
from Triangle;
