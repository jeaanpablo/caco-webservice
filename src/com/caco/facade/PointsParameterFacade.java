package com.caco.facade;

import java.util.List;

public interface PointsParameterFacade<PointsParameter> {
	
public boolean insert (PointsParameter pointsParameter);
	
	public List<PointsParameter> getAll();
	
	public void update( PointsParameter pointsParameter);

	public void delete( PointsParameter pointsParameter );

}
