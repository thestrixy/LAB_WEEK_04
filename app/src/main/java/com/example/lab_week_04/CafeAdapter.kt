package com.example.lab_week_04

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)
val TABS_CONTENT_FIXED = listOf(
    R.string.starbucks_desc,
    R.string.janjijiwa_desc,
    R.string.kopikenangan_desc,
)

class CafeAdapter(private val context: Context, fragmentManager: FragmentManager, lifecycle:

    override fun getItemCount: Int {
        return TABS_FIXED.size
    }
    override fun createFragment(position: Int): Fragment
    {
        return CafeDetailFragment.newInstance(context.getString(TABS_CONTENT_FIXED[position]
    }
)
