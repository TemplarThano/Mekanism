package mekanism.common.tile;

import java.util.Map;

import mekanism.api.MekanismConfig.usage;
import mekanism.common.block.states.BlockStateMachine;
import mekanism.common.block.states.BlockStateMachine.MachineBlockType;
import mekanism.common.recipe.RecipeHandler.Recipe;
import mekanism.common.recipe.inputs.ItemStackInput;
import mekanism.common.recipe.machines.SawmillRecipe;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;

public class TileEntityPrecisionSawmill extends TileEntityChanceMachine<SawmillRecipe>
{
	public TileEntityPrecisionSawmill()
	{
		super("sawmill", "PrecisionSawmill", MekanismUtils.getResource(ResourceType.GUI, "GuiBasicMachine.png"), usage.precisionSawmillUsage, 200, MachineBlockType.PRECISION_SAWMILL.baseEnergy);
	}

	@Override
	public Map<ItemStackInput, SawmillRecipe> getRecipes()
	{
		return Recipe.PRECISION_SAWMILL.get();
	}

	@Override
	public float getVolume()
	{
		return 0.7F;
	}
}
