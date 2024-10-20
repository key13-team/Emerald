package star.key13bb.emerald.ui.straight

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import star.key13bb.emerald.ui.components.ChipSlider

@Composable
fun CompactTransportScreen() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        ChipSlider()
    }
}