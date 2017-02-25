/**
 * Copyright (C) 2013 - 2016 Wuhan University
 * 
 * This program is free software; you can redistribute and/or modify it under 
 * the terms of the GNU General Public License version 2 as published by the 
 * Free Software Foundation.
 * 
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */
package com.geojmodelbuilder.engine;

import com.geojmodelbuilder.core.plan.IWorkflowExec;
import com.geojmodelbuilder.core.plan.examples.WorkflowWaterExtraction;
import com.geojmodelbuilder.engine.impl.WorkflowExecutor;
/**
 * 
 * @author Mingda Zhang
 *
 */
public class WorkflowExectuion_WaterExtraction {

	
	public static void main(String[] args) {
		IWorkflowExec workflow = new WorkflowWaterExtraction().getWorkflow();
		WorkflowExecutor executor2 = new WorkflowExecutor(workflow);
		executor2.run();
	}

}
