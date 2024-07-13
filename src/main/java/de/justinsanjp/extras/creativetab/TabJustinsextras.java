
package de.justinsanjp.extras.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import de.justinsanjp.extras.block.BlockBahnsteigkante;
import de.justinsanjp.extras.ElementsJustinsExtras;

@ElementsJustinsExtras.ModElement.Tag
public class TabJustinsextras extends ElementsJustinsExtras.ModElement {
	public TabJustinsextras(ElementsJustinsExtras instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabjustinsextras") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockBahnsteigkante.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
