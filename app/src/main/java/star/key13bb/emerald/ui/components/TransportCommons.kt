package star.key13bb.emerald.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import star.key13bb.emerald.R


val outlineIcons = listOf(
    R.drawable.transport_outline_tram,
    R.drawable.transport_outline_subway,
    R.drawable.transport_outline_train,
    R.drawable.transport_outline_bus,
    R.drawable.transport_outline_ferry,
    R.drawable.transport_outline_cable,
    R.drawable.transport_outline_gondola,
    R.drawable.transport_outline_funicular,
    R.drawable.transport_outline_trolleybus_temp,
    R.drawable.transport_outline_monorail
)

val filledIcons = listOf(
    R.drawable.transport_filled_tram,
    R.drawable.transport_filled_subway,
    R.drawable.transport_filled_train,
    R.drawable.transport_filled_bus,
    R.drawable.transport_filled_ferry,
    R.drawable.transport_filled_cable,
    R.drawable.transport_filled_gondola,
    R.drawable.transport_filled_funicular,
    R.drawable.transport_filled_trolleybus_temp,
    R.drawable.transport_filled_monorail
)

val names = listOf(
    R.string.transport_tram,
    R.string.transport_subway,
    R.string.transport_train,
    R.string.transport_bus,
    R.string.transport_ferry,
    R.string.transport_cable,
    R.string.transport_gondola,
    R.string.transport_funicular,
    R.string.transport_trolleybus,
    R.string.transport_monorail
)

@Composable
fun ChipSlider() {

    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        names.forEachIndexed { index, it ->
            val (selected, onOptionSelected) = remember { mutableIntStateOf(0) }
            FilterChip(
                selected = (it == selected),
                onClick = { onOptionSelected(it) },
                leadingIcon = if (it == selected) {
                    {
                        Icon(
                            imageVector = ImageVector.vectorResource(filledIcons[index]),
                            contentDescription = null
                        )
                    }
                } else {
                    {
                        Icon(
                            imageVector = ImageVector.vectorResource(outlineIcons[index]),
                            contentDescription = null
                        )
                    }
                },
                label = { Text(stringResource(it)) }
            )
        }
    }
}